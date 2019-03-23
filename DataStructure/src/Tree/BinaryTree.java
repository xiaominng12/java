/**
 * FileName: BinaryTree
 * Date:     2019/3/22 16:00
 * Description:
 * History:
 */
package Tree;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *   创建二叉树
 * @author
 * @since 1.0.0
 */
public class BinaryTree {
   //树的根节点
   private TreeNode root;

   public BinaryTree()
   {
    root = null;
   }

 /**
  * 根据给定值查找节点
  * @param value
  * @return
  */
 public TreeNode find(int value)
   {
    TreeNode current = root;
    //查找节点
    while (current.value != value)
    {
     if(value < current.value)
     {//当所给值小于当前节点值，往左查找节点
      current = current.leftNode;
     }else {
      current = current.rightNode;
     }
     if(current == null)
     {
      return null;
     }
    }
    return current;
   }

 /**
  * 插入数据
  * @param value
  */
 public void insert(int value)
   {
    TreeNode newNode = new TreeNode();
    newNode.value = value;
    if(root==null)
    {
     root = newNode;
    }else{
     TreeNode current = root;
     TreeNode parent;
     while(true)
     {
      parent = current;
      if(value < current.value)
      {
       current = current.leftNode;
       //判断是否到尾部
       if(current == null)
       {
        parent.leftNode = newNode;
        return;
       }
      }else{
       current = current.rightNode;
       if(current == null)
       {
        parent.rightNode = newNode;
        return;
       }
      }
     }
    }
   }

   public boolean delete(int value)
   {
    TreeNode current = root;
    TreeNode parent = root;
    boolean isLeftNode = true;

    while (current.value != value)
    {
     parent = current;
     if(value < current.value)
     {//左边查找树
      isLeftNode = true;
      current = current.leftNode;
     }else {
      isLeftNode = false;
      current = current.rightNode;
     }
     if(current == null)
     {
      return false;
     }
    }//若没有子节点，简单删除
    if(current.leftNode==null && current.rightNode==null)
    {
     if(current == root)
     {
      root = null;
     }else if(isLeftNode)
     {
      parent.leftNode = null;
     }else {
      parent.rightNode = null;
     }
    }//若没有右子节点，使用左边子树代替
    else if(current.rightNode == null)
    {
     if(current == root)
     {
      root = current.leftNode;
     }
     else if(isLeftNode)
     {
      parent.leftNode = current.leftNode;
     }else {
      parent.rightNode = current.leftNode;
     }
    }
    //若没有做子节点，由右边子树替换
    else if(current.leftNode == null) {
     if (current == root) {
      root = current.rightNode;
     } else if (isLeftNode) {
      parent.leftNode = current.rightNode;
     }
      else {
      parent.rightNode = current.rightNode;
     }
    }//有两个子节点
    else {
     TreeNode successor = getSuccessor(current);

     if(current == root)
     {
      root = successor;
     }
     else if(isLeftNode)
     {
      parent.leftNode = successor;
     }else {
      parent.rightNode = successor;
     }
     successor.leftNode = current.leftNode;
    }
    return true;
   }

 /**
  * 获得右边子节点，
  * @param delNode
  * @return
  */
 public TreeNode getSuccessor(TreeNode delNode)
   {
    TreeNode successorParent = delNode;
    TreeNode successor = delNode;
    TreeNode current = delNode.rightNode;
    while (current != null)
    {
     successorParent = successor;
     successor = current;
     current = current.leftNode;
    }
    if(successor != delNode.rightNode)
    {
     successorParent.leftNode = successor.rightNode;
     successor.rightNode = delNode.rightNode;
    }
    return successor;
   }

   public void traverse(int traverseType)
   {
    switch (traverseType)
    {
     case 1:System.out.println("\nPreorder traversal: ");
      preOrder(root);
      break;
     case 2:System.out.println("\nInorder traversal: ");
      inOrder(root);
      break;
     case 3:System.out.println("\nPostorder traversal: ");
      postOrder(root);
      break;
    }
    System.out.println();
   }

 /**
  * 中序遍历
  * @param localRoot
  */
 public void preOrder(TreeNode localRoot)
   {
    if(localRoot != null)
    {
     System.out.println(localRoot.value + " ");
     preOrder(localRoot.leftNode);
     preOrder(localRoot.rightNode);
    }
   }

   public void inOrder(TreeNode localRoot)
   {
    if(localRoot != null)
    {
     inOrder(localRoot.leftNode);
     System.out.println(localRoot.value + " ");
     inOrder(localRoot.rightNode);
    }
   }

   public void postOrder(TreeNode localRoot)
   {
    if(localRoot != null)
    {
     postOrder(localRoot.leftNode);
     postOrder(localRoot.rightNode);
     System.out.println(localRoot.value + " ");
    }
   }

   public void displayTree()
   {
    Stack globalStack = new Stack();
    globalStack.push(root);
    int nBlanks = 32;
    boolean isRowEmpty = false;
    System.out.println("-------------------------");
    while (isRowEmpty == false)
    {
     Stack localStack = new Stack();
     isRowEmpty = true;
     for(int j = 0;j<nBlanks;j++)
     {
      System.out.println(' ');
     }
     while (globalStack.isEmpty() == false)
     {
      TreeNode temp = (TreeNode)globalStack.pop();
      if (temp != null)
      {
       System.out.println(temp.value);
       localStack.push(temp.leftNode);
       localStack.push(temp.rightNode);
       if(temp.leftNode != null || temp.rightNode != null)
       {
        isRowEmpty = false;
       }
      }
      else {
       System.out.println("--");
       localStack.push(null);
       localStack.push(null);
      }
      for (int j = 0;j<nBlanks*2-2;j++)
      {
       System.out.println(' ');
      }
     }
     System.out.println("---------------------------------");
    }
   }


}
