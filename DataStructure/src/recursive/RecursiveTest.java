/**
 * FileName: RecursiveTest
 * Date:     2019/3/21 15:28
 * Description:
 * History:
 */
package recursive;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author
 * @since 1.0.0
 */
public class RecursiveTest {

    public static void main(String[] args)
    {
     print(10);
    }

    //递归操作
    public static void print(int i)
    {
     if(i>0) {
      System.out.println(i);
      print(i - 1);
     }
    }
}