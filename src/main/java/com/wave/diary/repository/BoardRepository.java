package com.wave.diary.repository;

import com.wave.diary.domain.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findByTitleContaining(String keyword);
    BoardEntity findByCreatedDate(LocalDate createdDate);
    Optional<BoardEntity> findFirstByCreatedDate(LocalDate date);
}