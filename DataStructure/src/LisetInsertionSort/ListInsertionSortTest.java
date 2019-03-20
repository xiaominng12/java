/**
 * Copyright (C), 2015-2019
 * FileName: ListInsertionSortTest
 * Author:   丁士明
 * Date:     2019/3/16 15:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package LisetInsertionSort;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author
 * @create 2019/3/16
 * @since 1.0.0
 */
class Link{
 public int dData;
 public Link next;

 public Link(int dData)
 {
  this.dData = dData;
 }

 public void displayLink()
 {
  System.out.println(dData + " ");
 }
}

class SortedList{
 private Link first;

 public SortedList()
 {
  first = null;
 }

 public SortedList(Link[] linkArr)
 {
  first = null;
  for(int i=0;i<linkArr.length;i++)
  {
   insert(linkArr[i]);
  }
 }

 public boolean isEmpty()
 {
  return (first == null);
 }

 /**
  * 插入数组元素
  * @param aa
  */
 public void insert(Link aa)
 {
    Link previous = null;
    Link current = first;

    while(current != null && aa.dData > current.dData)
    {
     previous = current;
     current = current.next;
    }

    if(previous == null)
    {
     first = aa;
    }else {
      previous.next = aa;
    }
    aa.next = current;
 }

 public Link remove()
 {
  Link temp = first;
  first = first.next;
  return temp;
 }

}
public class ListInsertionSortTest {
  public static void main(String[] args)
  {
   int size = 10;
   Link[] links = new Link[size];
   for(int i = 0;i<size;i++)
   {
    int n = (int)(Math.random()*99);
    Link newLink = new Link(n);
    links[i] = newLink;
   }
   System.out.println("未排序数组：");
    for(int i = 0;i<size;i++)
    {
     System.out.print(links[i].dData + " ");
    }
    System.out.println("");
    SortedList sortedList = new SortedList(links);

    for(int i = 0;i<size;i++)
    {
     links[i] = sortedList.remove();
    }
    System.out.println("排序后数组：");
    for(int i=0;i<size;i++)
    {
     System.out.print(links[i].dData + " ");
    }
    System.out.print("");
  }
}