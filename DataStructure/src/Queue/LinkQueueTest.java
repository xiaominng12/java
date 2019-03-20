package Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  使用链表实现队列
 * @author
 * @create 2019/3/16
 * @since 1.0.0
 */

/**
 * 定义链表基础类
 */
class Link{
  public int dData;
  public Link next;

  public Link(int dData)
  {
   this.dData = dData;
  }

  public void displayLink2()
  {
   System.out.print(dData + " ");
  }
}

/**
 * 创建链表实现类
 */
class Link2List{
  private Link first;
  private Link last;

  public Link2List()
  {
   first = null;
   last = null;
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
  * 在尾部插入链结点
  * @param dData
  */
 public void insertLast(int dData)
  {
   Link newLink2 = new Link(dData);
   if(isEmpty()) {
    first = newLink2;
   }
   else {
    last.next = newLink2;
   }
   last = newLink2;
  }

  public int deleteFirst()
  {
   int temp = first.dData;
   //当只有一个链结点时
   if(first.next == null)
   {
    last = null;
   }else {
    first = first.next;
   }
   return temp;
  }

 /**
  * 打印链表
  */
 public void displayLink2List()
  {
   Link current = first;
   while (current != null)
   {
    current.displayLink2();
    current = current.next;
   }
   System.out.println("");
  }
}

class Link2Queue
{
 private Link2List Link2List;
 public Link2Queue()
 {
  this.Link2List = new Link2List();
 }
 public boolean isEmpty()
 {
  return Link2List.isEmpty();
 }

 public void insert(int d)
 {
  Link2List.insertLast(d);
 }

 public int delete()
 {
  return Link2List.deleteFirst();
 }

 public void displayQueue()
 {
  Link2List.displayLink2List();
 }
}

public class LinkQueueTest {
   public static void main(String[] args)
   {
    Link2Queue Link2Queue = new Link2Queue();

    Link2Queue.insert(11);
    Link2Queue.insert(22);
    Link2Queue.insert(33);
    Link2Queue.displayQueue();
    Link2Queue.delete();
    Link2Queue.displayQueue();
    Link2Queue.insert(44);
    Link2Queue.insert(55);
    Link2Queue.displayQueue();
   }
}