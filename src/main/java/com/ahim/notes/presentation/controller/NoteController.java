package com.ahim.notes.presentation.controller;

import com.ahim.notes.persistence.entity.NoteEntity;
import com.ahim.notes.presentation.dto.NoteDTO;
import com.ahim.notes.service.interfaces.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    INoteService noteService;

    //New Note
    @PostMapping("/newNote")
    public ResponseEntity<?> save(@RequestBody NoteDTO noteDTO) throws URISyntaxException {

        if (noteDTO.getUser() == null){
            return ResponseEntity.badRequest().build();
        }

        if (noteDTO.getTitle().isBlank()){
            noteDTO.setTitle("Untitled");
        }

        noteService.save(NoteEntity.builder()
                        .title(noteDTO.getTitle())
                        .content(noteDTO.getContent())
                        .createdAt(LocalDate.now())
                        .updatedAt(LocalDate.now())
                        .user(noteDTO.getUser())
                        .tag(noteDTO.getTagSet())
                        .build());

        return ResponseEntity.created(new URI("/note/newNote")).build();
    }

    //Find Specific Note
    @GetMapping("/note/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        Optional<NoteEntity> optionalNote = noteService.findById(id);

        if (optionalNote.isPresent()){
            NoteEntity note = optionalNote.get();

            NoteDTO noteDTO = NoteDTO.builder()
                    .id(note.getId())
                    .title(note.getTitle())
                    .content(note.getContent())
                    .createdAt(note.getCreatedAt())
                    .updatedAt(note.getUpdatedAt())
                    .user(note.getUser())
                    .tagSet(note.getTag())
                    .build();
            return ResponseEntity.ok(noteDTO);
        }
        return ResponseEntity.notFound().build();
    }

    //Update Note
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateNote(@PathVariable Long id, @RequestBody NoteDTO noteDTO){
        Optional<NoteEntity> optionalNote = noteService.findById(id);

        if (optionalNote.isPresent()){
            NoteEntity note = optionalNote.get();

            note.setTitle(noteDTO.getTitle());
            note.setContent(noteDTO.getContent());
            note.setUpdatedAt(LocalDate.now());
            note.setTag(noteDTO.getTagSet());
            noteService.save(note);
            return ResponseEntity.ok("Updated successfully");
        }
        return ResponseEntity.notFound().build();
    }

    //Delete Note
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){

        if (id != null){
            noteService.deleteById(id);
            return ResponseEntity.ok("Deleted Successfully");
        }
        return ResponseEntity.notFound().build();
    }

    //Show All Notes
    @GetMapping("/showAll")
    public ResponseEntity<?> findAll(){
        List<NoteDTO> noteList = noteService.findAll()
                .stream()
                .map(note -> NoteDTO.builder()
                        .id(note.getId())
                        .title(note.getTitle())
                        .content(note.getContent())
                        .createdAt(note.getCreatedAt())
                        .updatedAt(note.getUpdatedAt())
                        .user(note.getUser())
                        .tagSet(note.getTag())
                        .build())
                .toList();
        return ResponseEntity.ok(noteList);
    }

    //Created Order Asc
    @GetMapping("/notesByCreatedAtAsc/{id}")
    public ResponseEntity<?> findByCreatedAtAndUserIdAsc(@PathVariable Long id) {

        List<NoteDTO> noteList = noteService.findAllByUserIdOrderByCreatedAtAsc(id)
                .stream()
                .map(note -> NoteDTO.builder()
                        .id(note.getId())
                        .title(note.getTitle())
                        .content(note.getContent())
                        .createdAt(note.getCreatedAt())
                        .updatedAt(note.getUpdatedAt())
                        .tagSet(note.getTag())
                        .build())
                .toList();
        return ResponseEntity.ok(noteList);
    }

    //Created Order Desc
    @GetMapping("/notesByCreatedAtDesc/{id}")
    public ResponseEntity<?> findByCreatedAtAndUserIdDesc(@PathVariable Long id) {

        List<NoteDTO> noteList = noteService.findAllByUserIdOrderByCreatedAtDesc(id)
                .stream()
                .map(note -> NoteDTO.builder()
                        .id(note.getId())
                        .title(note.getTitle())
                        .content(note.getContent())
                        .createdAt(note.getCreatedAt())
                        .updatedAt(note.getUpdatedAt())
                        .tagSet(note.getTag())
                        .build())
                .toList();
        return ResponseEntity.ok(noteList);
    }

    //Updated Order Asc
    @GetMapping("/notesByUpdatedAtAsc/{id}")
    public ResponseEntity<?> findByUpdatedAtAndUserIdAsc(@PathVariable Long id) {

        List<NoteDTO> noteList = noteService.findAllByUserIdOrderByUpdatedAtAsc(id)
                .stream()
                .map(note -> NoteDTO.builder()
                        .id(note.getId())
                        .title(note.getTitle())
                        .content(note.getContent())
                        .createdAt(note.getCreatedAt())
                        .updatedAt(note.getUpdatedAt())
                        .tagSet(note.getTag())
                        .build())
                .toList();
        return ResponseEntity.ok(noteList);
    }

    //Updated Order Desc
    @GetMapping("/notesByUpdatedAtDesc/{id}")
    public ResponseEntity<?> findByUpdatedAtAndUserIdDesc(@PathVariable Long id) {

        List<NoteDTO> noteList = noteService.findAllByUserIdOrderByUpdatedAtDesc(id)
                .stream()
                .map(note -> NoteDTO.builder()
                        .id(note.getId())
                        .title(note.getTitle())
                        .content(note.getContent())
                        .createdAt(note.getCreatedAt())
                        .updatedAt(note.getUpdatedAt())
                        .tagSet(note.getTag())
                        .build())
                .toList();
        return ResponseEntity.ok(noteList);
    }

    //Title Order Asc
    @GetMapping("/notesByTitleAsc/{id}")
    public ResponseEntity<?> findByTitleAndUserIdAsc(@PathVariable Long id) {

        List<NoteDTO> noteList = noteService.findAllByUserIdOrderByTitleAsc(id)
                .stream()
                .map(note -> NoteDTO.builder()
                        .id(note.getId())
                        .title(note.getTitle())
                        .content(note.getContent())
                        .createdAt(note.getCreatedAt())
                        .updatedAt(note.getUpdatedAt())
                        .tagSet(note.getTag())
                        .build())
                .toList();
        return ResponseEntity.ok(noteList);
    }

    //Title Order Desc
    @GetMapping("/notesByTitleDesc/{id}")
    public ResponseEntity<?> findByTitleAndUserIdDesc(@PathVariable Long id) {

        List<NoteDTO> noteList = noteService.findAllByUserIdOrderByTitleDesc(id)
                .stream()
                .map(note -> NoteDTO.builder()
                        .id(note.getId())
                        .title(note.getTitle())
                        .content(note.getContent())
                        .createdAt(note.getCreatedAt())
                        .updatedAt(note.getUpdatedAt())
                        .tagSet(note.getTag())
                        .build())
                .toList();
        return ResponseEntity.ok(noteList);
    }
}
