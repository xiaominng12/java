/**
 * FileName: TreeNode
 * Date:     2019/3/22 16:02
 * Description:
 * History:
 */
package Tree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  节点类
 * @author
 * @since 1.0.0
 */
public class TreeNode {

 int value;
 //左节点
 TreeNode leftNode;
 //右节点
 TreeNode rightNode;


 /**
  * 显示节点
   */
 public void displayTreeNode()
 {
  System.out.println('{');
  System.out.println(value);
  System.out.println('}');
 }

}