/**
 * FileName: FilterExample
 * Author:   Lenovo
 * Date:     12/25/2018 5:23 PM
 * Description:
 * History:
 */
package com.javatpoint.io.filteroutputstream;

//Example of FilterOutputStream class
import java.io.*;
public class FilterExample {
    public static void main(String[] args) throws IOException {
        File data = new File("D:\\testout.txt");
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
        System.out.println("Success...");
    }
}

