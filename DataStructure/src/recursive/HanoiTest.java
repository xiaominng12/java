/**
 * FileName: HanoiTest
 * Date:     2019/3/21 15:43
 * Description:
 * History:
 */
package recursive;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * 递归实现汉诺塔
 * @author
 * @since 1.0.0
 */
public class HanoiTest {
   public static void main(String[] args)
   {
    hanoi(3,'A','B','C');
   }

   /**
    *
    * @param n 共有n个盘子
    * @param from 开始的柱子
    * @param in 中间的柱子
    * @param to 目标柱子
    * 无论有多少个盘子，都认为只有两个，上面的所有盘子和最下面一个盘子
    */
   public static void hanoi(int n,char from,char in,char to)
   {//只有一个盘子

      if(n==1){
        System.out.println("第1个盘子从" + from + "移到" + to);
      }else{
         //移动上面的所有盘子到中间位置
         hanoi(n-1,from,to,in);
         //移动下面的盘子
         System.out.println("第" + n + "个盘子从" + from + "移动到" + to);
         //把上面的所有盘子从指间位置移到目标位置
         hanoi(n-1,in,from,to);
      }
   }
}