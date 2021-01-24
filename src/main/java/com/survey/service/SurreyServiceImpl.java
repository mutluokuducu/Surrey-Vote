package com.survey.service;

import com.survey.dto.SurreyQuestionsRequestDto;
import com.survey.repository.SurreyQuestionsEntity;
import com.survey.repository.SurreyRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class SurreyServiceImpl implements SurreyService {

  @Autowired
  private SurreyRepository surreyRepository;

  @Override
  public void saveSurrey(SurreyQuestionsRequestDto surreyQuestionsRequestDto) {

    SurreyQuestionsEntity surreyQuestionsEntity = SurreyQuestionsEntity.builder()
        .moreInfo(surreyQuestionsRequestDto.getMoreInfo())
        .question1(surreyQuestionsRequestDto.getQuestion1())
        .question2(surreyQuestionsRequestDto.getQuestion2())
        .question3(surreyQuestionsRequestDto.getQuestion3())
        .question4(surreyQuestionsRequestDto.getQuestion4())
        .question5(surreyQuestionsRequestDto.getQuestion5())
        .question6(surreyQuestionsRequestDto.getQuestion6())
        .question7(surreyQuestionsRequestDto.getQuestion7())
        .question8(surreyQuestionsRequestDto.getQuestion8())
        .question9(surreyQuestionsRequestDto.getQuestion9())
        .question10(surreyQuestionsRequestDto.isRepeated())
        .build();

    surreyRepository.save(surreyQuestionsEntity);

  }

  @Override
  public List<SurreyQuestionsEntity> getSurrey() {

    List<SurreyQuestionsEntity> list = surreyRepository.findAll();

    return list;
  }
}
