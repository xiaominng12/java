/**
 * FileName: BinaryTreeTest
 * Date:     2019/3/22 16:01
 * Description:
 * History:
 */
package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author
 * @since 1.0.0
 */
public class BinaryTreeTest {


    public static void main(String[] args) throws Exception
    {
     int value;
     BinaryTree binaryTree = new BinaryTree();
     binaryTree.insert(12);
     binaryTree.insert(23);
     binaryTree.insert(98);
     binaryTree.insert(92);
     binaryTree.insert(12);
   //  binaryTree.displayTree();
     while (true)
     {
      System.out.print("Enter first letter of show: ");
      System.out.print("insert,find,delete,or traverse: ");
      int choice = getChar();
      switch (choice)
      {
       case 's':
        binaryTree.displayTree();
        break;
       case 'i':
        System.out.print("Enter value to insert: ");
        value = getInt();
        binaryTree.insert(value);
        break;
       case 'f':
        System.out.print("Enter value to find: ");
        value = getInt();
        TreeNode found = binaryTree.find(value);
        if(found != null)
        {
         System.out.println("Found: ");
         found.displayTreeNode();
         System.out.print("\n");
        }
        else {
         System.out.print("Could not find ");
         System.out.print(value + '\n');
        }
       case 'd':
        System.out.print("Enter value to delete: ");
        value = getInt();
        boolean didDelete = binaryTree.delete(value);
        if(didDelete)
        {
         System.out.print("Deleted" + value + '\n');
        }else {
         System.out.print("Could not delete ");
         System.out.print(value + '\n');
        }
        break;
       case 't':
        System.out.print("Enter typr 1,2 or 3 ");
        value = getInt();
        binaryTree.traverse(value);
        break;
        default:
         System.out.print("Invalid entry\n");
      }
     }
    }
    public static String getString() throws IOException
    {
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
     String s = br.readLine();
     return s;
    }

    public static char getChar() throws IOException
    {
     String s = getString();
     return s.charAt(0);
    }

    public static int getInt() throws IOException
    {
     String s = getString();
     return Integer.parseInt(s);
    }



}