/**
 * Copyright (C), 2015-2019
 * FileName: Link2StackTest
 * Author:   丁士明
 * Date:     2019/3/14 22:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stack;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author
 * @create 2019/3/14
 * @since 1.0.0
 */

class Link{
   public int dData;
   public Link next;

   public Link(int dData)
   {
    this.dData = dData;
   }

 /**
  * 打印链表数据
  */
 public void display()
   {
    System.out.print(dData + " ");
   }
}

/**
 * 创建链表类
 */
class Link2List{
  private Link first;

  public Link2List()
  {
   first = null;
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
  public void insertFirst(int dd)
  {
   Link newLink2 = new Link(dd);
   newLink2.next = first;
   first = newLink2;
  }

 /**
  * 删除头结点
  * @return
  */
 public int deleteFirst()
  {
   Link temp = first;
   first = first.next;
   return temp.dData;
  }

 /**
  * 打印链表
  */
 public void displayList()
  {
   Link current = first;
   while( current != null)
   {
    current.display();
    current = current.next;
   }
   System.out.println("");
  }
}

class Link2Stack{

  private Link2List Link2List;
  public Link2Stack()
  {
   Link2List = new Link2List();
  }

 /**
  * 数据入栈
  * @param aa
  */
  public void push(int aa)
  {
   Link2List.insertFirst(aa);
  }

 /**
  * 数据出栈
  * @return
  */
  public int pop()
  {
   return Link2List.deleteFirst();
  }

 /**
  * 判断栈是否为空
  * @return
  */
  public boolean isEmpty()
  {
   return Link2List.isEmpty();
  }
  public void displayStack()
  {
   System.out.println("stack(top->bottom): ");
   Link2List.displayList();
  }

}
public class LinkStackTest {
   public static void main(String[] args)
   {
    Link2Stack Link2Stack = new Link2Stack();
    Link2Stack.push(11);
    Link2Stack.push(22);
    Link2Stack.push(33);
    Link2Stack.push(44);

    Link2Stack.displayStack();
    Link2Stack.push(55);

    Link2Stack.displayStack();

    Link2Stack.pop();
    Link2Stack.pop();
    Link2Stack.displayStack();


   }
}