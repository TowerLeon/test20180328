/**
 * FileName: InputStreamReader
 * Author:   Lenovo
 * Date:     12/25/2018 8:02 PM
 * Description:
 * History:
 */
package com.javatpoint.io.inputstreamreader;

//Example
import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        try  {
            InputStream stream = new FileInputStream("D:\\file.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
