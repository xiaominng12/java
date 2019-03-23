/**
 * FileName: RadixSort
 * Date:     2019/3/22 13:22
 * Description:
 * History:
 */
package radixsort;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *   基数排序，适合比较大数排序，将数组中的数据按照位数分成个位、十位等一次进行比较
 * @author
 * @since 1.0.0
 */
public class RadixSort {

 public static void main(String[] args) {
  int[] arr = new int[]{12, 34, 890, 265, 797, 192, 122, 1, 121};
  radixSort(arr);
  System.out.println(Arrays.toString(arr));
 }

 public static void radixSort(int[] arr) {//存数组中最大的数
  int max = Integer.MAX_VALUE;
  for (int i = 0; i < arr.length; i++) {
   if (arr[i] > max) {
    max = arr[i];

   }
  }
  //计算最大数字是几位数
  int maxLength = (max + "").length();
  //用于临时存储数据的数组
  int[][] temp = new int[10][arr.length];
  //用于记录在相应的数组中存放的数字的数量
  int[] counts = new int[10];
  //根据最大长度的数决定比较次数
  for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
   for (int j = 0; j < arr.length; j++) {
    //计算余数
    int ys = arr[j] / n % 10;
    //把当前遍历的数据放入指定数组中
    temp[ys][counts[ys]] = arr[j];
    //记录数量
    counts[ys]++;
   }
   //记录取得数据需要放的位置
   int index = 0;
   //把数字取出来
   for (int k = 0; k < counts.length; k++) {
    //记录数量的数组中，当前余数记录的数量不为0
    if (counts[k] != 0) {
     for (int l = 0; l < counts[k]; l++) {
      //取出元素
      arr[index] = temp[k][l];
      index++;
     }
     counts[k] = 0;
    }

   }
  }
 }
}