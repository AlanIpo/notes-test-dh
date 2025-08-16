package com.ahim.notes.presentation.controller;

import com.ahim.notes.persistence.entity.TagEntity;
import com.ahim.notes.presentation.dto.TagDTO;
import com.ahim.notes.service.interfaces.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    ITagService tagService;

    //new tag
    @PostMapping("/newTag")
    public ResponseEntity<?> save(@RequestBody TagDTO tagDTO) throws URISyntaxException {

        if (tagDTO.getTag().isBlank()){
            return ResponseEntity.badRequest().build();
        }

        tagService.save(TagEntity.builder()
                        .tag(tagDTO.getTag())
                        .build());

        return ResponseEntity.created(new URI("/tag/newTag")).build();
    }

    /*show tags by user id

    public ResponseEntity<?> findTagByUserId(@PathVariable Long id){

        List<TagDTO> tagList = tagService.findTagsByUserId(id)
                .stream()
                .map(tag -> TagDTO.builder()
                        .id(tag.getId())
                        .tag(tag.getTag())
                        .build())
                .toList();
        return ResponseEntity.ok(tagList);
    }*/

}
