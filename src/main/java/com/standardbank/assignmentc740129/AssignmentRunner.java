package com.standardbank.assignmentc740129;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentRunner implements CommandLineRunner {

  @Autowired
  Assignment1 assignment1;

  @Autowired
  Assignment2 assignment2;

  @Override
  public void run(String... args) throws Exception {
    assignment1.run();
    assignment2.run();
  }

  public static void main(String[] args) throws Exception {

    SpringApplication.run(AssignmentRunner.class, args);

  }
}
