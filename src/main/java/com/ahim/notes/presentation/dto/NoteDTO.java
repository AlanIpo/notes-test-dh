package com.ahim.notes.presentation.dto;

import com.ahim.notes.persistence.entity.TagEntity;
import com.ahim.notes.persistence.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteDTO {

    private Long id;
    private String title;
    private String content;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private UserEntity user;
    private Set<TagEntity> tagSet = new HashSet<>();
}
