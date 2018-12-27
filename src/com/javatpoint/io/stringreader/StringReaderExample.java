/**
 * FileName: StringReaderExample
 * Author:   Lenovo
 * Date:     12/25/2018 8:13 PM
 * Description:
 * History:
 */
package com.javatpoint.io.stringreader;

//Java StringReader Example
import java.io.StringReader;
public class StringReaderExample {
    public static void main(String[] args) throws Exception {
        String srg = "Hello Java!! \nWelcome to Javatpoint.";
        StringReader reader = new StringReader(srg);
        int k=0;
        while((k=reader.read())!=-1){
            System.out.print((char)k);
        }
    }
}
