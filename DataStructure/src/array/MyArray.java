
package array;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  将数组封装成对象
 * @author
 * @create 2019/3/21
 * @since 1.0.0
 */
public class MyArray {

    private int[] elements;

    public MyArray()
    {
     elements = new int[0];
    }

 /**
  * 获取数组长度
  * @return
  */
 public int size()
    {
     return elements.length;
    }

 /**
  * 在数组末尾添加数据
  * @param elements
  */
 public void add(int element)
    {
     int[] newarr = new int[elements.length+1];
     for(int i=0;i<elements.length;i++)
     {//将原数组中的元素复制到新数组
      newarr[i] = elements[i];
     }
     //把添加的元素放入到新数组
     newarr[elements.length] = element;
     //新数组替换原数组
     elements = newarr;
    }

 /**
  * 删除数组中的元素
  * @param index
  */
 public void delete(int index)
    {
     if(index <0 || index >elements.length-1)
     {
      throw new RuntimeException("下标错误");
     }else {
      int[] newarr = new int[elements.length-1];
      for(int i = 0;i<newarr.length;i++)
      {
       if(i<index)
       {//复制删除下标前的数
        newarr[i] = elements[i];
       }else {//复制删除下标后的数据
        newarr[i] = elements[i+1];
       }
      }
      elements = newarr;
     }
    }

 /**
  * 获取某个位置的元素
  * @param index
  * @return
  */
 public int get(int index)
    {
        return elements[index];
    }

 /**
  * 插入元素到指定位置
  * @param index
  * @param element
  */
 public void insert(int index,int element)
    {
       int[] newarr = new int[elements.length +1];
       if(index < 0 || index > elements.length-1)
       {
        throw new RuntimeException("下标错误");
       }else {
        for(int i = 0;i<elements.length;i++)
        {
         if(i <index)
         {
          newarr[i] = elements[i];
         }else {
          newarr[i+1] = elements[i];
         }
        }
        //插入新元素
        newarr[index] = element;

        elements = newarr;
       }
    }

 /**
  * 线性查找
  * @param target
  */

 public int lineSearch(int target)
    {
      for(int i = 0;i<elements.length;i++)
      {
       if(elements[i] == target)
       {
        return i;
       }
      }
      return -1;
    }

    public int binarySearch(int target)
    {
     int start = 0;
     int end = elements.length-1;
     int middle = (start + end)/2;

     //循环查找
     while(true)
     {//开始位置在结束位置之后或重合
      if(start >= end)
      {
       return -1;
      }
      if(elements[middle] == target)
      {
       return middle;
      }else {
       if(elements[middle] > target)
       {
        end = middle - 1;
       }else {
        start = middle + 1;
       }
       middle = (start+end)/2;
      }
     }
    }

 /**
  * 打印数组
  */
 public void print()
    {
     System.out.println(Arrays.toString(elements));
    }

}