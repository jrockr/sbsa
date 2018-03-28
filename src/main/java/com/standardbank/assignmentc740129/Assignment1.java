package com.standardbank.assignmentc740129;

import com.standardbank.assignmentc740129.assignment1.DivideAndRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

@SpringBootApplication
public class Assignment1 implements CommandLineRunner {

  private final Logger logger = LoggerFactory.getLogger(Assignment1.class);

  public static void main(String[] args) throws Exception {

    SpringApplication.run(Assignment1.class, args);


  }

  @Override
  public void run(String... args) throws Exception {
    DivideAndRule rule = new DivideAndRule();
    logger.info("Running Divedand Rule Assignment ..");
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