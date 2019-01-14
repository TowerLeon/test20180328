package com.javatpoint.io.bufferedoutputstream; /**
 * FileName: BufferedOutputStreamExample
 * Author:   Lenovo
 * Date:     12/25/2018 10:35 AM
 * Description:
 * History:
 */

//Example of BufferedOutputStream class:
import java.io.*;
public class BufferedOutputStreamExample{
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
