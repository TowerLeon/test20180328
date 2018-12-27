/**
 * FileName: WriterExample
 * Author:   Lenovo
 * Date:     12/25/2018 5:46 PM
 * Description:
 * History:
 */
package com.javatpoint.io.writer;


//Java Writer Example
import java.io.*;
public class WriterExample {
    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("output.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}