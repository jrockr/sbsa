package com.standardbank.assignmentc740129;

import com.standardbank.assignmentc740129.assignment2.ResturantPuzzel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

@Service
public class Assignment2 {
  private final Logger logger = LoggerFactory.getLogger(Assignment2.class);

  @Autowired
  ResturantPuzzel puzzel;


  public void run(String... args) throws Exception {
      logger.info("Assignment 2");
      logger.info("Number of Test Cases :");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      int testCases = Integer.parseInt(in.readLine());
      for(int i=0;i<testCases;i++){

        try{
          String input1 = in.readLine();
          String input1Array[] = input1.split(" ");

          if(input1Array.length==3){
            int n=Integer.parseInt(input1Array[0]);
            int x = Integer.parseInt(input1Array[1]);
            int y = Integer.parseInt(input1Array[2]);

            logger.info("N = {} : X = {} : Y = {}",n,x,y);
            if(puzzel.checkN(n) && puzzel.totalAllocation(n,x,y)){
              logger.info("Insert Ai");
              String input2 = in.readLine();
              String [] inputArray2 = input2.split(" ");
              logger.info("Insert Bi");
              String input3 = in.readLine();
              String [] inputArray3 = input3.split(" ");


              int[]a = stringArrayToIntArray(inputArray2);
              int[]b = stringArrayToIntArray(inputArray3);

              logger.info("Max Tip :: {}",puzzel.findMaxTip(a,b,n));



            }else{
              throw new Exception("Constraint violation ");
            }

          }else{
            throw new Exception("Input mismatch ,expect 3 integers");
          }
        }catch (Exception e){
          logger.error(e.getMessage());
        }

      }


  }

  private int[] stringArrayToIntArray(String[] s)  {
    return Stream.of(s).mapToInt(Integer::parseInt).toArray();
  }

}
