/**
 * FileName: DoublyLinkedTest
 * Date:     2019/3/22 14:32
 * Description:
 * History:
 */
package DoublyLinked;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author
 * @since 1.0.0
 */
public class DoublyLinkedTest {

   public static void main(String[] args)
   {
    DoublyLinked d = new DoublyLinked();
    d.insertFirst(11);
    d.insertFirst(28);
    d.insertFirst(78);
    d.insertFirst(899);
    d.insertFirst(67);
    d.displayForward();
    d.displayBackward();
    d.deleteFirst();
    d.deleteLast();
    d.deleteKey(78);
    d.displayForward();

   }
}