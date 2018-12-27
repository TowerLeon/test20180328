/**
 * FileName: FileOutputStreamExample
 * Author:   Lenovo
 * Date:     12/27/2018 11:30 AM
 * Description:
 * History:
 */
package com.javatpoint.io.fileoutputstream;

//Java FileOutputStream Example 1: write byte
import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}


////Java FileOutputStream example 2: write string
//import java.io.FileOutputStream;
//public class FileOutputStreamExample {
//    public static void main(String args[]){
//        try{
//            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
//            String s="Welcome to javaTpoint.";
//            byte b[]=s.getBytes();//converting string into byte array
//            fout.write(b);
//            fout.close();
//            System.out.println("success...");
//        }catch(Exception e){System.out.println(e);}
//    }
//}