/**
 * FileName: BinarySearch
 * Date:     2019/3/21 14:07
 * Description:
 * History:
 */
package Search;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * 二分查找
 * @author
 * @since 1.0.0
 */
public class BinarySearch {
    public static void main(String[] args)
    {
     int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
     int target=8;
     //记录开始位置
     int start = 0;
     //记录结束位置
     int end = arr.length-1;
     //记录中间位置
     int middle = (start + end)/2;
     //记录目标位置
     int index = -1;

     //循环查找
     while(true)
     {
      if(arr[middle] == target)
      {
       index = middle;
       break;
      }else {
       //中间元素大于目标元素
       if(arr[middle] > target)
       {//把结束位置调整到中间位置前一个位置
        end = middle-1;
       }else {
        //把开始位置调整到中间位置后一个位置
          start = middle +1;
       }
       middle = (start + end)/2;
      }
     }
     System.out.println("index:" + index);
    }


}