
package Search;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  实现线性查找
 * @author
 * @create 2019/3/21
 * @since 1.0.0
 */
public class LineSearch {

 public static void main(String[] args)
 {
  int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
  int target = 7;
  int index = 0;

  for(int i=0;i<arr.length;i++)
  {
   if(arr[i] == target)
   {
    index = i;
    break;
   }
  }
  System.out.println("index:" + index);
 }

}