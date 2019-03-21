/**
 * FileName: Febonacci
 * Date:     2019/3/21 15:32
 * Description:
 * History:
 */
package recursive;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  斐波那契数列
 * @author
 * @since 1.0.0
 */
public class Febonacci {
    public static void main(String[] args)
    {
      System.out.println(febonacci(3));
    }

    //打印第n项斐波那契数列
    public static int febonacci(int i)
    {
     if(i==1|| i==2)
     {
      return 1;
     }else
     {
      return (febonacci(i-1)+febonacci(i-2));
     }
    }
}