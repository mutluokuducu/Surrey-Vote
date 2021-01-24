package com.survey.service;

import com.survey.dto.SurreyQuestionsRequestDto;
import com.survey.repository.SurreyQuestionsEntity;
import java.util.List;

public interface SurreyService {

  void saveSurrey(SurreyQuestionsRequestDto surreyQuestionsRequestDto);

  List<SurreyQuestionsEntity> getSurrey();
}
