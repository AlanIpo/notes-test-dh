package com.ahim.notes.presentation.dto;

import com.ahim.notes.persistence.entity.NoteEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagDTO {

    private Long id;
    private String tag;
}
