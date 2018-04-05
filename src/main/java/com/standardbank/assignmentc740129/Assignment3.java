package com.standardbank.assignmentc740129;


import com.standardbank.assignmentc740129.assignment3.BinaryTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Assignment3 {

  @Autowired
  BinaryTreeService binaryTreeService;

  public void run(String... args) throws Exception {


    binaryTreeService.addNode(7);
    binaryTreeService.addNode(6);
    binaryTreeService.addNode(5);
    binaryTreeService.addNode(4);
    binaryTreeService.addNode(3);
    binaryTreeService.addNode(2);
    binaryTreeService.addNode(1);

    binaryTreeService.bfsTraversal(binaryTreeService.root);;

  }
}
