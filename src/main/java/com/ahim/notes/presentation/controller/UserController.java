package com.ahim.notes.presentation.controller;

import com.ahim.notes.presentation.dto.UserDTO;
import com.ahim.notes.service.interfaces.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private IUserService userService;

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<UserDTO> userList = userService.findAll()
                .stream()
                .map(user -> UserDTO.builder()
                        .id(user.getId())
                        .name(user.getName())
                        .email(user.getEmail())
                        .username(user.getUsername())
                        .noteList(user.getNoteList())
                        .build())
                .toList();
        return ResponseEntity.ok(userList);
    }

}
