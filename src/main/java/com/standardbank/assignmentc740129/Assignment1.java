package com.standardbank.assignmentc740129;

import com.standardbank.assignmentc740129.assignment1.DivideAndRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.BufferedReader;
import java.io.InputStreamReader;



@Service
public class Assignment1 {

  @Autowired
  private DivideAndRule rule;

  private final Logger logger = LoggerFactory.getLogger(Assignment1.class);


  public void run(String... args) throws Exception {

    logger.info("Running Assignment 1");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    logger.info("Input number of test Cases");
    int testCase = Integer.parseInt(in.readLine());
    if(rule.checkTestCases(testCase)){
      for(int i=0;i<testCase;i++){
        logger.info("Input number ");
        int input = Integer.parseInt(in.readLine());
        if(rule.checkInput(input)){
          logger.info("Result :: {}",rule.divideby8(input));
        }else{
          logger.error("Input not in range 1 to 999");
        }
      }
    }else{
      logger.error("Invalid Parameters for Test case 1 to 100 only");
    }

  }
}