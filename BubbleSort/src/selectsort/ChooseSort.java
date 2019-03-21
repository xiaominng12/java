/**
 * Copyright (C), 2015-2019
 * FileName: ChooseSort
 * Author:   丁士明
 * Date:     2019/3/9 19:17
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
package selectsort;
/**
 * 选择排序
 * @author Administrator
 *
 */
public class ChooseSort {
 private int[] array;
 private int length;

 public ChooseSort(int[] array){
  this.array = array;
  this.length = array.length;
 }

 /**
  * 打印数组中的所有元素
  */
 public void display(){
  for(int i: array){
   System.out.print(i+" ");
  }
  System.out.println();
 }

 /**
  * 选择排序算法
  */
 public void chooseSort(){
  for(int i=0; i<length-1; i++){
   int minIndex = i;
   for(int j=minIndex+1;j<length;j++){
    if(array[j]<array[minIndex]){
     minIndex = j;
    }
   }
   int temp = array[i];
   array[i] = array[minIndex];
   array[minIndex] = temp;
  }
 }

 public static void main(String[] args){
  int[] array={100,45,36,21,17,13,7,0};
  ChooseSort cs = new ChooseSort(array);
  System.out.println("排序前的数据为：");
  cs.display();
  cs.chooseSort();
  System.out.println("排序后的数据为：");
  cs.display();
 }
}