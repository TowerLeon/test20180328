/**
 * FileName: FilterExample
 * Author:   Lenovo
 * Date:     12/27/2018 2:20 PM
 * Description:
 * History:
 */
package com.javatpoint.io.filterinputstream;

//Example of FilterInputStream class
import java.io.*;
public class FilterExample {
    public static void main(String[] args) throws IOException {
        File data = new File("D:\\testout.txt");
        FileInputStream  file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k =0;
        while((k=filter.read())!=-1){
            System.out.print((char)k);
        }
        file.close();
        filter.close();
    }
}
