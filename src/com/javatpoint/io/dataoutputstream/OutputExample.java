/**
 * FileName: DataOutputStream
 * Author:   Lenovo
 * Date:     12/25/2018 1:36 PM
 * Description:
 * History:
 */
package com.javatpoint.io.dataoutputstream;

//Example of DataOutputStream class
import java.io.*;
public class OutputExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Succcess...");
    }
}
