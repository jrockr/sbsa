package com.standardbank.assignmentc740129.assignment3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BinaryTreeService {

  private final Logger logger = LoggerFactory.getLogger(BinaryTreeService.class);
  public BinaryTreeNode root;

  public BinaryTreeService(){

    root = null;
  }


  private BinaryTreeNode insert(BinaryTreeNode node,int key){
    // For Root of the tree
    if(node==null){
      node=new BinaryTreeNode(key);
      node.setValue(key);
      logger.info("Added {}",key);
      return node;
    }else{
      if(node.getLeft()==null){
        logger.info("Left {}",key);
        node.setLeft(insert(node.getLeft(),key));
      }else if(node.getRight()==null){
        logger.info("Right {}",key);
        node.setRight(insert(node.getRight(),key));
      }
    }

    return node;
  }

  public void addNode(int key) {
    //logger.info("Inserting {}",key);
    root = insert(root, key);

  }

  public void bfsTraversal(BinaryTreeNode root){
    int h = height(root);
    logger.info("Height of Tree {}",h);
    int i;
    for (i=1; i<=h; i++){
      logger.info("Height {}",i);
      printGivenLevel(root, i);
    }


  }

  private int height(BinaryTreeNode root)
  {
    if (root == null)
      return 0;
    else
    {
      int lheight = height(root.getLeft());
      int rheight = height(root.getRight());

      if (lheight > rheight)
        return(lheight+1);
      else return(rheight+1);
    }
  }

  private  void printGivenLevel (BinaryTreeNode root ,int level)
  {
    if (root == null)
      return;
    if (level == 1)
      logger.info("value {} ",root.getValue());
    else if (level > 1)
    {
      printGivenLevel(root.getLeft(), level-1);
      printGivenLevel(root.getRight(), level-1);
    }
  }

}
