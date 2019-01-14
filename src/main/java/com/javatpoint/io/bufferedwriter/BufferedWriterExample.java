/**
 * FileName: BufferedWriterExample
 * Author:   Lenovo
 * Date:     12/25/2018 5:52 PM
 * Description:
 * History:
 */
package com.javatpoint.io.bufferedwriter;

//Example of Java BufferedWriter
import java.io.*;
public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("D:\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to javaTpoint.");
        buffer.close();
        System.out.println("Success");
    }
}
