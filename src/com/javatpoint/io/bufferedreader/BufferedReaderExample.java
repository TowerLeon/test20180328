/**
 * FileName: BufferedReaderExample
 * Author:   Lenovo
 * Date:     12/25/2018 5:53 PM
 * Description:
 * History:
 */
package com.javatpoint.io.bufferedreader;

////Java BufferedReader Example
//import java.io.*;
//public class BufferedReaderExample {
//    public static void main(String args[])throws Exception{
//        FileReader fr=new FileReader("D:\\testout.txt");
//        BufferedReader br=new BufferedReader(fr);
//
//        int i;
//        while((i=br.read())!=-1){
//            System.out.print((char)i);
//        }
//        br.close();
//        fr.close();
//    }
//}


////Reading data from console by InputStreamReader and BufferedReader
//import java.io.*;
//public class BufferedReaderExample{
//    public static void main(String args[])throws Exception{
//        InputStreamReader r=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(r);
//        System.out.println("Enter your name");
//        String name=br.readLine();
//        System.out.println("Welcome "+name);
//    }
//}

//Another example of reading data from console until user writes stop
import java.io.*;
public class BufferedReaderExample{
    public static void main(String args[])throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String name="";
        while(!name.equals("stop")){
            System.out.println("Enter data: ");
            name=br.readLine();
            System.out.println("data is: "+name);
        }
        br.close();
        r.close();
    }
}