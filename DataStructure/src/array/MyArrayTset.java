
package array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author
 * @create 2019/3/21
 * @since 1.0.0
 */
public class MyArrayTset {
    public static void main(String[] args)
    {
     MyArray myArray = new MyArray();
     myArray.add(1);
     myArray.add(78);
     myArray.add(91);
     myArray.print();
     myArray.delete(1);
     myArray.print();
   //  System.out.println(myArray.get(1));
     System.out.println("-----------------");
     myArray.insert(1,90);
     myArray.insert(0,92);
     myArray.print();
     System.out.println(myArray.lineSearch(92));
     System.out.println(myArray.binarySearch(0));
    }
}