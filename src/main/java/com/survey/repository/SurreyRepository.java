package com.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SurreyRepository extends JpaRepository<SurreyQuestionsEntity, Long> {

}