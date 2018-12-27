/**
 * FileName: FileWriter
 * Author:   Lenovo
 * Date:     12/25/2018 5:50 PM
 * Description:
 * History:
 */
package com.javatpoint.io.filewriter;

//Java FileWriter Example
import java.io.FileWriter;
public class FileWriterExample {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("D:\\testout.txt");
            fw.write("Welcome to javaTpoint.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}