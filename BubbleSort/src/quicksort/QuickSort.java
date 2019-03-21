/**
 * FileName: QuickSort
 * Date:     2019/3/21 16:14
 * Description:
 * History:
 */
package quicksort;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author
 * @since 1.0.0
 */
public class QuickSort {

    public static void main(String[] args)
    {
     int[] arr = new int[] {1,9,23,41,31,11,2,4,};
     quickSort(arr,0,arr.length-1);
     System.out.println(Arrays.toString(arr));
    }

 /**
  * 快速排序实现算法
  * @param arr
  * @param start
  * @param end
  */
 public static void quickSort(int[] arr,int start,int end) {
  if (start < end) {
   //把数组中第0个数作为标准数
   int a = arr[start];
   //记录需要排序的下标
   int low = start;
   int high = end;
   //循环找出比标准数大的数和比标准数小的数
   while (low < high) {//右边的数字比标准数大
    while (low < high && a <= arr[high]) {
     high--;
    }
    //使用右边的数替换左边的数
    arr[low] = arr[high];
    //左边的数字比标准数小
    while (low < high && arr[low] <= a) {
     low++;
    }
    //使用左边的数替换右边的数
    arr[high] = arr[low];
   }//将标准数赋给低所在位置的元素
   arr[low] = a;
   //处理所有小的数字
   quickSort(arr, start, low);
   //处理所有大的数字
   quickSort(arr, low + 1, end);
  }
 }
}