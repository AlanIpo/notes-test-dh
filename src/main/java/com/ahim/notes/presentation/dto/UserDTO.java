package com.ahim.notes.presentation.dto;

import com.ahim.notes.persistence.entity.NoteEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String username;
    private List<NoteEntity> noteList = new ArrayList<>();
}
