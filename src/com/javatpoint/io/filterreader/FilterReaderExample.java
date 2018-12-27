/**
 * FileName: FilterReaderExample
 * Author:   Lenovo
 * Date:     12/25/2018 8:20 PM
 * Description:
 * History:
 */
package com.javatpoint.io.filterreader;

//Example
import java.io.*;
class CustomFilterReader extends FilterReader {
    CustomFilterReader(Reader in) {
        super(in);
    }
    public int read() throws IOException {
        int x = super.read();
        if ((char) x == ' ')
            return ((int) '?');
        else
            return x;
    }
}
public class FilterReaderExample {
    public static void main(String[] args) {
        try  {
            Reader reader = new FileReader("javaFile123.txt");
            CustomFilterReader fr = new CustomFilterReader(reader);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
            reader.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
