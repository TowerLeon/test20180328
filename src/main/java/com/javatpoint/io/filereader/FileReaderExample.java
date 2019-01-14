/**
 * FileName: FileReaderExample
 * Author:   Lenovo
 * Date:     12/25/2018 5:51 PM
 * Description:
 * History:
 */
package com.javatpoint.io.filereader;

//Java FileReader Example
import java.io.FileReader;
public class FileReaderExample {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("D:\\testout.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}