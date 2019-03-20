/**
 * Copyright (C), 2015-2019
 * FileName: FirstLastListTest
 * Author:   丁士明
 * Date:     2019/3/14 21:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Link2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  双端链表
 * @author
 * @create 2019/3/14
 * @since 1.0.0
 */

/**
 * 创建基本链表结构
 */
class Link21{
 public long dData;
 public Link21 next;

 /**
  * 构造函数，初始化链表
  * @param dData
  */
 public Link21(long dData)
 {
  this.dData = dData;
 }
  public void displayLink21()
  {
   System.out.print(dData + " ");
  }
}

/**
 * 创建双端链表
 */
class FirstLastList
{
   //头结点
   private Link21 first;
   //尾结点
   private Link21 last;

   public FirstLastList()
   {
    first = null;
    last = null;
   }

 /**
  * 判断是否为空
  * @return
  */
 public boolean isEmpty()
   {
    return (first == null);
   }

 /**
  * 在头结点插入结点
  * @param dd
  */
 public void insertFirst(long dd)
   {
    Link21 newLink2 = new Link21(dd);
    if(isEmpty()) {
     last = newLink2;
    }
    else {
     newLink2.next = first;
    }
    first = newLink2;
   }

 /**
  * 在尾结点插入结点
  */
 public void insertLast(long dd)
 {
  Link21 newLink2 = new Link21(dd);
  if(isEmpty())
  {
   first = newLink2;
  }else {
   last.next = newLink2;
  }
  last = newLink2;
 }

 /**
  * 删除头结点
  * @return
  */
 public long deleteFirst()
 {
   long temp = first.dData;
   //当只有一个结点时
   if(first.next == null)
   {
    last =null;
   }else {
    first = first.next;
   }
   return temp;
 }

 /**
  * 打印链表数据
  */
 public void displayList()
 {
  System.out.println("List (first --> last): ");
  Link21 current = first;
  while (current != null)
  {
   current.displayLink21();
   current = current.next;
  }
  System.out.println("");
 }
}

public class FirstLastListTest {
  public static void main(String[] args)
  {
   FirstLastList fll = new FirstLastList();
   fll.insertFirst(11);
   fll.insertFirst(22);
   fll.insertFirst(33);
   fll.insertLast(44);
   fll.insertLast(55);
   fll.insertLast(66);

   fll.displayList();

   fll.deleteFirst();
   fll.deleteFirst();

   fll.displayList();
  }
}