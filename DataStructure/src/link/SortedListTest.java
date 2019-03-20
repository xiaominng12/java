package Link2; /**
 * Copyright (C), 2015-2019
 * FileName: Link2.SortedListTest
 * Author:   丁士明
 * Date:     2019/3/16 14:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  有序链表
 * @author
 * @create 2019/3/16
 * @since 1.0.0
 */

class Link2{
 public int dData;
 public Link2 next;

 public Link2(int dData)
 {
  this.dData = dData;
 }

 public void disLink2()
 {
  System.out.print(dData + " ");
 }
}

class SortedList
{
 private Link2 first;

 public SortedList()
 {
  first = null;
 }

 public boolean isEmpty()
 {
  return (first == null);
 }

 public void insert(int dd)
 {
  Link2 newLink2 = new Link2(dd);
  Link2 previous = null;
  Link2 current = first;
  //知道到底链表尾部或插入结点值大于当前节点值
  while (current != null && dd > current.dData)
  {
   previous = current;
   current = current.next;
  }
  //当处于开始处时
  if(previous == null)
  {
   first = newLink2;
  }else {
   previous.next = newLink2;
  }
  newLink2.next = current;
 }

 public Link2 remove()
 {
  Link2 temp = first;
  first = first.next;
  return temp;
 }
 public void displaySortedList()
 {
  Link2 current = first;
  while (current != null)
  {
   current.disLink2();
   current = current.next;
  }
  System.out.println("");
 }

}
public class SortedListTest {
  public static void main(String[] args)
  {
   SortedList sortedList = new SortedList();
   sortedList.insert(11);
   sortedList.insert(22);
   sortedList.displaySortedList();
   sortedList.insert(45);
   sortedList.insert(44);
   sortedList.insert(34);
   sortedList.displaySortedList();
   sortedList.remove();
   sortedList.displaySortedList();
  }
}