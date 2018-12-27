/**
 * FileName: Input1
 * Author:   Lenovo
 * Date:     12/25/2018 11:07 AM
 * Description:
 * History:
 */
package com.javatpoint.io.sequenceinputstream;

//Example that reads the data from two files and writes into another file
import java.io.*;
class Input1{
    public static void main(String args[])throws Exception{
        FileInputStream fin1=new FileInputStream("D:\\testin1.txt");
        FileInputStream fin2=new FileInputStream("D:\\testin2.txt");
        FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
        SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
        int i;
        while((i=sis.read())!=-1)
        {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");
    }
}
