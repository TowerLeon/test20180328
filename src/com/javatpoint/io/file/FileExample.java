/**
 * FileName: FileExample
 * Author:   Lenovo
 * Date:     12/25/2018 8:22 PM
 * Description:
 * History:
 */
package com.javatpoint.io.file;

////Java File Example 3
//import java.io.*;
//public class FileExample {
//    public static void main(String[] args) {
//        File f=new File("D://");
//        String filenames[]=f.list();
//        for(String filename:filenames){
//            System.out.println(filename);
//        }
//    }
//}

//Java File Example 4
import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        File dir=new File("D://");
        File files[]=dir.listFiles();
        for(File file:files){
            System.out.println(file.getName()+" Can Write: "+file.canWrite()+" Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");
        }
    }
}