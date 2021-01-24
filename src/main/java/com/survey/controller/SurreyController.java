package com.survey.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.survey.dto.SurreyQuestionsRequestDto;
import com.survey.repository.SurreyQuestionsEntity;
import com.survey.service.SurreyService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurreyController {

  @Autowired
  public SurreyService surreyService;

  @ApiOperation(
      value = "Surrey",
      nickname = "Surrey",
      response = ResponseEntity.class)
  @PostMapping(
      value = "/api/v1/surrey",
      consumes = APPLICATION_JSON_VALUE,
      produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<Void> roboticHooverResponse(
      @RequestBody SurreyQuestionsRequestDto surreyQuestionsRequestDto) {

    surreyService.saveSurrey(surreyQuestionsRequestDto);

    return ResponseEntity.ok().build();
  }

  @ApiOperation(
      value = "Surrey",
      nickname = "Surrey",
      response = ResponseEntity.class)
  @GetMapping(
      value = "/api/v1/surrey")
  public ResponseEntity<List<SurreyQuestionsEntity>> roboticHooverResponse() {

    List<SurreyQuestionsEntity> responseEntity = surreyService.getSurrey();

    return ResponseEntity.ok().body(responseEntity);
  }
}
