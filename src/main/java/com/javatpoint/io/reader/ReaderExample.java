/**
 * FileName: ReaderExample
 * Author:   Lenovo
 * Date:     12/27/2018 2:50 PM
 * Description:
 * History:
 */
package com.javatpoint.io.reader;

//Example
import java.io.*;
public class ReaderExample {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("file.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

