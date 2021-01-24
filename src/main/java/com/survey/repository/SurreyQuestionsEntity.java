package com.survey.repository;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "payment_transactions")
public class SurreyQuestionsEntity {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private long id;
  @Column(name = "moreInfo")
  private String moreInfo;
  @Column(name = "question1")
  private String question1;
  @Column(name = "question2")
  private String question2;
  @Column(name = "question3")
  private String question3;
  @Column(name = "question4")
  private String question4;
  @Column(name = "question5")
  private String question5;
  @Column(name = "question6")
  private String question6;
  @Column(name = "question7")
  private String question7;
  @Column(name = "question8")
  private String question8;
  @Column(name = "question9")
  private String question9;
  @Column(name = "question10")
  private boolean question10;
}
