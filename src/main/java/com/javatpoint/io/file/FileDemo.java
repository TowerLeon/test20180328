/**
 * FileName: FileDemo
 * Author:   Lenovo
 * Date:     12/25/2018 8:21 PM
 * Description:
 * History:
 */
package com.javatpoint.io.file;

//Java File Example 1
import java.io.*;
public class FileDemo {
    public static void main(String[] args) {

        try {
            File file = new File("javaFile123.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
