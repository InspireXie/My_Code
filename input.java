/*
一、java不像C中拥有scanf这样功能强大的函数，大多是通过定义输入输出流对象。常用的类有BufferedReader，Scanner。
实例程序：
1、利用 Scanner 实现从键盘读入integer或float 型数据
*/
//import java.io.*;
import java.util.*;
public class InputTest{
public static void main(String[] args){
  Scanner in = new Scanner(System.in);    //Scanner类
  System.out.println("Please input a float number:");
  float a = in.nextFloat();    //接收float数据
  System.out.println("Please input a string: ");    //这里试了一下输入String数据，但中间有空格就不能显示，Scanner类还不具有这功能
  Scanner str = new Scanner(System.in);
  System.out.println("The string is :" + str.next());
  System.out.println("The float number is: " + a);
  for(int i = 0;i < 4;i++){
   System.out.println("Please input a int number: ");   //for循环接收int型数据
   int b = in.nextInt();
   System.out.println("The int number is: " + b);
  }
}
}
//2、利用 BufferedReader实现从键盘读入字符串并写进文件abc.txt中
import java.io.*;
public class InputTest{
public static void main(String[] args) throws IOException{
  BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
  BufferedWriter buf2 = new BufferedWriter(new FileWriter("abx.txt"));
  String str = buf.readLine();
  while(!str.equals("exit")){
   buf2.write(str);
   buf2.newLine();
   str = buf.readLine();
  }
  buf.close();
  buf2.close();
}
}
/*
关于JDK1.5 Scanner类的说明
Scanner是SDK1.5新增的一个类,可是使用该类创建一个对象.
Scanner reader=new Scanner(System.in);
然后reader对象调用下列方法(函数),读取用户在命令行输入的各种数据类型:
next.Byte(),nextDouble(),nextFloat,nextInt(),nextLine(),nextLong(),nextShot()
使用nextLine()方法输入行中可能包含空格.如果读取的是一个单词,则可调用.next()方法


3、Scanner和BufferedReader的区别
在命令行模式下要输入数据至程序中时,我们可以使用标准输入串对象System.in.但是,我们并不经常直接使用它,因为System.in提供的 read方法每次只能读取一个字节的数据,而我们平时所应用的通常是读取一个字符串或者是一个数字,所以read方法所以提供的功能,对我们来说并没有太大的用处.
在Java SE 6中,可以使用Scanner类取得用户的输入,Scanner类位于java.util包中,如果你要使用Scanner取得用户输入的话,要加上 import java.util.Scanner;这条语句.import的功能是告诉编译器,你将使用java.util包中的Scanner类.
我们来看一个例子: 
*/
import java.util.Scanner;
public class TestScanner{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("请输入一个字符串:");
System.out.println("您输入的字符串是:" + scan.next());
}
}
/*运行上面的程序,你将会看到你输入的字符串将在下面原样显示出来.
我们来看看这个程序中每条语句的意思:
new是创建一个对象,程序中new的意思是创建了一个Scanner类的对象scan.但是在创建Scanner类的对象时,需要用System.in 作为它的参数,也可以将Scanner看作是System.in对象的支持者,System.in取得用户输入的内容后,交给Scanner来作一些处理.
Scanner类中提供了多个方法:
next():取得一个字符串;
nextInt():将取得的字符串转换成int类型的整数;
nextFloat():将取得的字符串转换成float型;
nextBoolean():将取得的字符串转换成boolean型;
用Scanner获得用户的输入非常的方便,但是Scanner取得输入的依据是空格符,包括空格键,Tab键和Enter键.当按下这其中的任一键时,Scanner就会返回下一个输入. 当你输入的内容中间包括空格时,显然,使用Scanner就不能完整的获得你输入的字符串.这时候我们可以考虑使用BufferedReader类取得输入.其实在Java SE 1.4及以前的版本中,尚没有提供Scanner方法,我们获得输入时也是使用BufferReader的.
BufferedReader类位于java.io包中,所以要使用这个类,就要引入java.io这个包:import java.io.BufferedReader.
使用BufferedReader对象的readLine()方法必须处理java.io.IOException异常(Exception).
使用BufferedReader来取得输入,理解起来要复杂得多.但是使用这个方法是固定的,每次使用前先如法炮制就可以了.
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
String text = buffer.readLine();
readLine()方法会返回用户在按下Enter键之前的所有字符输入,不包括最后按下的Enter返回字符.
完整的示例程序如下:*/
import java.io.BufferedReader;
public class TestBufferedReader{
public static void main(String[] args) throws IOException{
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
System.out.println("请输入一串字符串");
String text = buffer.readLine();
System.out.println("您输入的字符串是:" + text);
}
}
//4、如下面的程序所示：class StringTest
{
public static void main(String[] args)
{
System.out.println(args[0]);
System.out.println(args[1]);
System.out.println(args[2]);
}
}
/*在执行语句即：java + 类名后面输入内容，即会被args接收，
因为args是接收命令行参数的。*/
