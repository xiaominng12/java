/**
 * Copyright (C), 2015-2019
 * FileName: Link2List
 * Author:   丁士明
 * Date:     2019/3/14 19:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Link2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  单向链表
 * @author
 * @create 2019/3/14
 * @since 1.0.0
 */

class Link
{
    //关键字
    public int iData;
    public double dData;
    public Link next;

    public Link(int id,double dd)
    {
     this.iData = id;
     this.dData = dd;
    }

 /**
  * 打印链表数据
  */
 public void displayLink2()
    {
     System.out.print("{" + iData + "," + dData + "}");
    }
}

class Link2List
{
   private Link first;
   public Link2List()
   {
    first = null;
   }

 /**
  * 判断链表是否为空
  * @return
  */
 public boolean isEmpty()
   {
    return (first == null);
   }

 /**
  * 在链表首部插入数据
  * @param id
  * @param dd
  */
   public void insertFirst(int id,double dd)
   {
     Link newLink2 = new Link(id,dd);
     //插入点的指针指向原初始位置
     newLink2.next = first;
     //将插入的点放在首位
     first = newLink2;
   }

 /**
  * 查找指定关键字的链接点
  * @param key
  * @return
  */
 public Link find(int key)
   {
    Link current = first;
    while(current.iData != key)
    {//当到达链表尾部
     if(current.next == null)
     {
      return null;
     }else {//向下一个节点移动
      current = current.next;
     }
    }
    return current;
   }

 /**
  * 删除指定关键字链接点
  * @param key
  * @return
  */
 public Link delete(int key)
   {
    Link current = first;
    Link privious = first;
    while (current.iData != key)
    {
     if(current.next == null)
     {
      return null;
     }
     else {//到下一个链接点
      privious = current;
      current = current.next;
     }
    }//当第一个节点为需要删除的链接点时
    if(current == first)
    {
     first = first.next;
    }else {//将删除链接点的前一个链接点指向后一个链接点
     privious.next = current.next;
    }
    return current;
   }
 /**
  * 删除链表第一个元素值
  * @return
  */
 public Link deleteFirst()
   {
     //暂存变量，存储链表头值
     Link temp = first;
     //删除第一个元素后，将first指向下一个
     first = first.next;
     return temp;
   }

 /**
  * 打印链表数据
  */
 public void displayList()
   {
    System.out.println("List(first->last):");
    Link current = first;
    //到达链表尾时
    while (current != null)
    {
     current.displayLink2();
     current = current.next;
    }
    System.out.println("");
   }
}
public class LinkListTest {
  /* public static void main(String[] args)
   {
    Link2List Link2List = new Link2List();
    Link2List.insertFirst(11,2.99);
    Link2List.insertFirst(12,3.09);
    Link2List.insertFirst(23,9.99);
    Link2List.insertFirst(43,99.99);

    Link2List.displayList();

    while (!Link2List.isEmpty())
    {
     Link2 Link2 = Link2List.deleteFirst();
     System.out.println("Delete: ");
     Link2.displayLink2();
     System.out.println("");
    }
    Link2List.displayList();
   }*/

    public static void main(String[] args)
    {
     Link2List Link2List = new Link2List();
     Link2List.insertFirst(22,1.99);
     Link2List.insertFirst(23,2.99);
     Link2List.insertFirst(24,3.99);
     Link2List.insertFirst(25,4.99);

     Link2List.displayList();

     Link f = Link2List.find(23);
     if(f != null)
     {
      System.out.println("Found Link2 with key " + f.iData);
     }else {
      System.out.println("Can't find Link2");
     }
     Link d =  Link2List.delete(23);
     if(d != null)
     {
      System.out.println("Deleted Link2 with key " + d.iData);
     }else
     {
      System.out.println("can't delete Link2");
     }
     Link2List.displayList();
    }


}