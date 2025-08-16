package com.ahim.notes.persistence.repository;

import com.ahim.notes.persistence.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, Long> {

    /*@Query("SELECT DISTINCT t FROM tag t JOIN t.note n WHERE n.user.id = :userId")
    List<TagEntity> findTagsByUserId(@Param("userId") Long userId);*/

}
