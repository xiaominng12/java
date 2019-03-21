package bubblesort; /**
 * Copyright (C), 2015-2019
 * FileName: BubbleSortTest
 * Author:   丁士明
 * Date:     2019/3/9 17:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author
 * @create 2019/3/9
 * @since 1.0.0
 */

 public class BubbleSort {

 /**
  * 用于交换两个元素
  * @param a
  * @param b
  */
 private long[] array;
 private long length;

 /**
  * 构造方法，用于初始化数组
  * @param array
  */
 public BubbleSort(long[] array)
 {
  this.array = array;
  this.length = array.length;
 }

 /**
  * 用于输出数组
  */
 public void disPlay()
    {
     for(int i=0;i<length;i++)
     {
      System.out.println(array[i] + " ");
     }
     System.out.println();
    }

 /**
  * 进行冒泡排序
  */
 public  void bubbleSort()
    {
     //排序轮数
     for(int i=0;i<length-1;i++) {
      //比较次数
      for (int j = 0; j < length - 1 - i; j++)
      {
       if (array[j + 1] < array[j]  ) {
        long temp = array[j+1];
        array[j+1] = array[j];
        array[j] = temp;
       }
      }
     }
    }
 public static void main(String[] args)
 {
  long[] a = {1,23,9,16,89,3,53};
  BubbleSort bs = new BubbleSort(a);
  System.out.println("排序前数据为：");
  bs.disPlay();
  bs.bubbleSort();
  System.out.println("排序后数据为：");
  bs.disPlay();

 }

}

