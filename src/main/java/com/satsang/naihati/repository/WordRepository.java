package com.satsang.naihati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satsang.naihati.model.Word;

public interface WordRepository extends JpaRepository<Word, Long> {

}
