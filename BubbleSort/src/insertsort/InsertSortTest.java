package insertsort; /**
 * Copyright (C), 2015-2019
 * FileName: insertsort.InsertSortTest
 * Author:   丁士明
 * Date:     2019/3/9 19:40
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
 * 创建插入排序类
 */
class InsertSort
{
  private long[] array;
  private long length;

 /**
  * 构造函数，初始化数据
  * @param array
  */
  public InsertSort(long[] array)
  {
   this.array = array;
   this.length = array.length;
  }

 /**
  * 打印数据
  */
 public void disPlay()
  {
    for (long a : array)
    {
     System.out.println(a);
    }
  }
/**
 * 插入排序算法：
 * 1、以数组的某一位作为分隔位，比如index=1，假设左面的都是有序的.
 *
 * 2、将index位的数据拿出来，放到临时变量里，这时index位置就空出来了.
 *
 * 3、从leftindex=index-1开始将左面的数据与当前index位的数据（即temp）进行比较，如果array[leftindex]>temp,
 * 则将array[leftindex]后移一位，即array[leftindex+1]=array[leftindex],此时leftindex就空出来了.
 *
 * 4、再用index-2(即leftindex=leftindex-1)位的数据和temp比，重复步骤3，
 * 直到找到<=temp的数据或者比到了最左面（说明temp最小），停止比较，将temp放在当前空的位置上.
 *
 * 5、index向后挪1，即index=index+1，temp=array[index],重复步骤2-4，直到index=array.length,排序结束，
 * 此时数组中的数据即为从小到大的顺序.*/
 public void insertSort()
  {
   for(int index = 1;index < length;index++)
   {//临时变量，用作数据比较
    long temp = array[index];
    int leftindex = index-1;
    //当比到最左边，或比到比temp小的数据时，结束循环
    while(leftindex >=0 && array[leftindex] > temp){
     array[leftindex + 1] = array[leftindex];
     leftindex --;
    }
    array[leftindex + 1] = temp;
   }
  }

}
public class InsertSortTest {
  public static void main(String[] args)
  {
   long[] a = {28,18,90,87,27,2,39,1,8};
   InsertSort is = new InsertSort(a);
   System.out.println("排序前数据为：");
   is.disPlay();
   System.out.println("排序后数据为：");
   is.insertSort();
   is.disPlay();
  }
}