/**
 * Copyright (C), 2015-2019
 * FileName: DoublyLinked
 * Author:   丁士明
 * Date:     2019/3/16 15:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package DoublyLinked;

import java.util.function.DoubleUnaryOperator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  创建双线链表
 * @author
 * @create 2019/3/16
 * @since 1.0.0
 */

class Link
{
 public int dData;
 //下一个链结点
 public Link next;
 //上一个链结点
 public Link previous;

 public Link(int dData)
 {
  this.dData = dData;
 }

 public void displayLink()
 {
  System.out.print(dData +" ");
 }
}

public class DoublyLinked {
  private Link first;
  private Link last;

  public DoublyLinked()
  {
   first = null;
   last = null;
  }

  public boolean isEmpty()
  {
   return (first == null);
  }

 /**
  * 首端插入链结点
  * @param aa
  */
 public void insertFirst(int aa)
  {
   Link newLink = new Link(aa);
   if(isEmpty())
   {
    last = newLink;
   }
   else
   {
    first.previous = newLink;
   }
   newLink.next = first;
   first = newLink;
  }

 /**
  * 尾部插入结点
  * @param aa
  */
  public void insertLast(int aa)
  {
   Link newLink = new Link(aa);

   if(isEmpty())
   {
    first = newLink;
   }else
   {
    last.next = newLink;
    newLink.previous = last;
   }
   last = newLink;
  }

 /**
  * 删除首端链结点
  * @return
  */
 public Link deleteFirst()
  {
   Link temp = first;
   if(first.next == null)
   {//只有一个链结点
    last = null;
   }else{
    first.next.previous = null;
   }
   first = first.next;
   return temp;
  }

 /**
  * 删除尾端结点
  * @return
  */
 public Link deleteLast()
  {
   Link temp = last;
   if(first.next == null)
   {
    first = null;
   }else {
    last.previous.next = null;
   }
   last = last.previous;
   return temp;
  }

 /**
  * 在key后插入链结点
  * @param key
  * @param aa
  * @return
  */
  public boolean insertAfter(int key,int aa)
  {
   Link current = first;
   //直到匹配key
   while(current.dData != key)
   {
    current = current.next;
    //当到达尾部为匹配到
    if(current.next == null) {
     return false;
    }
   }
   Link newLink = new Link(aa);
   if(current == last)
   {
    newLink.next = null;
    last = newLink;
   }
   else
   {
    newLink.next = current.next;
    current.next.previous = newLink;
   }
   newLink.previous = current;
   current.next = newLink;
   return true;
  }

 /**
  * 删除key处链结点
  * @param key
  * @return
  */
 public Link deleteKey(int key)
 {
  Link current = first;

  while (current.dData != key)
  {
   current = current.next;
   if(current == null)
   {
    return null;
   }
  }
  if(current == first)
  {
   first = current.next;
  }
  else {
   current.previous.next = current.next;
  }

  if(current == last)
  {
   last = current.previous;
  }else {
   current.next.previous = current.previous;
  }
  return current;
 }

 public void displayForward()
 {
  System.out.println("List()");
 }
}