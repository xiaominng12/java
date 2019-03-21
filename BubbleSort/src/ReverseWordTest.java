/**
 * Copyright (C), 2015-2019
 * FileName: ReverseWordTest
 * Author:   丁士明
 * Date:     2019/3/10 14:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *  栈实例字符逆序输出
 * @author
 * @create 2019/3/10
 * @since 1.0.0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 创建实现栈的类,基于数组实现
 */
class Stack {
 //栈数组的范围
 private int maxSize;
 //栈数组
 private char[] stackArray;
 //栈的首部
 private int top;

 /**
  * Stack构造函数，用于初始化栈
  *
  * @param maxSize
  */
 public Stack(int maxSize)
 {
  this.maxSize = maxSize;
  this.stackArray = new char[maxSize];
  //栈顶元素下标
  this.top = -1;
 }

 /**
  * 数据入栈操作
  *
  * @param i
  */
 public void push(char i)
 {
  stackArray[++top] = i;
 }

 /**
  * 数据出栈操作
  *
  * @param j
  */
 public char pop() {
  return stackArray[top--];
 }


 /**
  * 返回栈的顶部数据
  *
  * @return
  */
 public char peek() {
  return stackArray[top];
 }

 /**
  * 判断栈是否为空
  * @return
  */
 public boolean isEmpty()
 {
  return(top == -1);
 }

 /**
  * 判断栈是否满
  * @return
  */
 public boolean idFull()
 {
  return (top == maxSize - 1);
 }
}

/**
 * 创建单词逆序的类
 */
class ReverseWord
{
 private String input;
 private String output;

 public ReverseWord(String in)
 {
  this.input = in;
 }
 /**
  * 进行单词逆序
  * @return
  */
 public String doRev()
 {//获得栈的容量
  int size = input.length();
  Stack s = new Stack(size);

  for(int i = 0;i<size;i++)
  {//将字符串转换成字符数组
   char ch = input.charAt(i);
   //将字符入栈
   s.push(ch);
  }
   output = "";
  while (!s.isEmpty())
  {//数据出栈
   char ch = s.pop();
   output = output + ch;
  }
  return output;
 }

}

 /**
  * 创建匹配分割符的类
  */
 class MatchBreak
 {
   private String input;

  /**
   * 构造函数，初始化对象
   * @param input
   */
  public MatchBreak(String input)
   {
    this.input = input;
   }

  /**
   * 用于匹配分隔符
   */
  public void check()
   {//获取栈容量
    int size = input.length();
    Stack stack = new Stack(size);
    for (int i=0;i<size;i++)
    {//将字符串转换成字符
     char ch = input.charAt(i);
     switch(ch)
     {
      case '{':
      case '[':
      case '(':
       stack.push(ch);
       break;
      case '}':
      case ']':
      case ')':
       //若栈不为空
       if(! stack.isEmpty()) {
        char c = stack.pop();
        if ((ch == '}' && c != '{') ||
         (ch == ']' && c != '[') ||
         (ch == ')' && c != '(')) {
         System.out.println("错误：" + ch + " " + i);
        }
       }else {
        System.out.println("错误：" + ch + " " + i);
        break;
       }
       default:
        break;
       }
     }
     if(!stack.isEmpty())
     {
      System.out.println("错误：错过正确的分隔符");
    }
   }
 }


public class ReverseWordTest {
 public static void main(String[] args)throws IOException{
  String input;
  while(true)
  {
   System.out.println("输入字符：");
   System.out.flush();
   input = getString();
   if(input.equals("")) {
    break;
   }
   MatchBreak mb = new MatchBreak(input);
   mb.check();

  }
 }
 public static String getString()throws IOException{

  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  String s = br.readLine();
  return s;
 }
}
