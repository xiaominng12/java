/**
 * FileName: ShellSort
 * Date:     2019/3/21 19:07
 * Description:
 * History:
 */
package insertsort;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  希尔排序算法
 * @author
 * @since 1.0.0
 */
public class ShellSort {
    public static void main(String[] args)
    {
     int[] arr = new int[] {1,3,12,4,6,8,20,25};
     shellSort(arr);
     System.out.println(Arrays.toString(arr));
    }

 /**
  * 希尔排序
  * @param arr
  */
 public static void shellSort(int[] arr)
    {
     int k = 1;
     //遍历所有的增量
     for(int d = arr.length/2;d>0;d/=2)
     {//遍历所有元素
      for(int i=d;i<arr.length;i++)
      {//遍历本组中的所有元素
       for(int j = i-d;j>=0;j-=d)
       {//若当前元素大于加上增量后的那个元素
        if(arr[j] > arr [j+d]){
            int temp = arr[j];
            arr[j] = arr[j+d];
            arr[j+d] = temp;
        }
       }
      }
      System.out.println("第" + k +"次排序结果：" + Arrays.toString(arr));
      k++;
     }
    }
}