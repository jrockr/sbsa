package com.standardbank.assignmentc740129.assignment1;

public class DivideAndRule {

  public int divideby8(int value){
    if(value%8 == 0){
      return 1 ;
    }
    else{
      return -1;
    }
  }

  public boolean checkTestCases(int value){
    if(value>=1 && value <=100){
      return true;
    }
    else{
      return false;
    }
  }

  public boolean checkInput(int value){
    if(value>=1 && value < 1000){
      return true;
    }
    else{
      return false;
    }
  }
  
}
