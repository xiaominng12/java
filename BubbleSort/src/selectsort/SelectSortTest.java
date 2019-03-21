package selectsort; /**
 * Copyright (C), 2015-2019
 * FileName: selectsort.SelectSortTest
 * Author:   丁士明
 * Date:     2019/3/9 18:52
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

/**
 * 创建一个选择排序类
 */
class SelectSort
{
  private long[] array;
  private long length;

 /**
  * 构造函数，用于初始化数组
  * @param array
  */
  public SelectSort(long[] array)
  {
   this.array = array;
   this.length = array.length;
  }

 /**
  * 用于打印数组
  */
 public void display()
  {
   for(int i=0;i<length;i++)
   {
    System.out.println(array[i] + " ");
   }
   System.out.println();
  }

 /**
  * 进行选择排序
  */
 public void selectSort()
  {

   //外层循环，每轮指针指向位置
   for(int i=0;i<length-1;i++)
   {//设最小元素位置为i
    int min = i;
    //内层循环，用于比较元素大小,并将指针指向最小值处
    for(int j=i+1;j<length;j++)
    {
     if(array[j] < array[min] )
     {
      min = j;
     }
    }
    long temp = array[i];
    array[i] = array[min];
    array[min] = temp;
   }
  }
}

public class SelectSortTest {
   public static void main(String[] args)
   {
    long[] a = {1,8,4,2,7,9,0,3};
    SelectSort ss = new SelectSort(a);
    System.out.println("排序前数据为：");
    ss.display();
    System.out.println("排序后数据为：");
    ss.selectSort();
    ss.display();
   }

}