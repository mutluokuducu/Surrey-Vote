package com.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class SurreyQuestionsResponseDto {

  private String moreInfo;
  private String question1;
  private String question2;
  private String question3;
  private String question4;
  private String question5;
  private String question6;
  private String question7;
  private String question8;
  private String question9;
  private boolean repeated;
}
