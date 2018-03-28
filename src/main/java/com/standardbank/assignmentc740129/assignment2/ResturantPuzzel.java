package com.standardbank.assignmentc740129.assignment2;

import org.springframework.stereotype.Service;

@Service
public class ResturantPuzzel {

  public boolean checkN(int value){
    if(value>=1 && value <=105){
      return true;
    }else{
      return false;
    }
  }

  public boolean totalAllocation(int n, int x ,int y){

    boolean result=false;

    if(x>=1 && x<=n){
      if(y>=1 && y<=n){
        if((x+y)>=n){
          result = true;
        }
      }else{
        result = false;
      }
    }else{
      result = false;
    }

    return result;
  }

  public int findMaxTip(int[]a,int[]b,int n){
    int max=0;

    for(int i=0;i<n;i++){
      max+=Math.max(a[i],b[i]);
    }

    return max;
  }

}
