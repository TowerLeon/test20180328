/**
 * FileName: PrintStreamTest
 * Author:   Lenovo
 * Date:     12/25/2018 6:22 PM
 * Description:
 * History:
 */
package com.javatpoint.io.printstream;

////Example of java PrintStream class
//import java.io.FileOutputStream;
//import java.io.PrintStream;
//public class PrintStreamTest{
//    public static void main(String args[])throws Exception{
//        FileOutputStream fout=new FileOutputStream("D:\\testout.txt ");
//        PrintStream pout=new PrintStream(fout);
//        pout.println(2016);
//        pout.println("Hello Java");
//        pout.println("Welcome to Java");
//        pout.close();
//        fout.close();
//        System.out.println("Success?");
//    }
//}

//Example of printf() method using java PrintStream class
class PrintStreamTest{
    public static void main(String args[]){
        int a=19;
        System.out.printf("%d",a); //Note: out is the object of printstream
    }
}