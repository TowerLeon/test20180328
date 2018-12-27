/**
 * FileName: PipeReaderExample2
 * Author:   Lenovo
 * Date:     12/25/2018 8:14 PM
 * Description:
 * History:
 */
package com.javatpoint.io.pipedwriter;

//Example
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeReaderExample2 {
    public static void main(String[] args) {
        try {

            final PipedReader read = new PipedReader();
            final PipedWriter write = new PipedWriter(read);

            Thread readerThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        int data = read.read();
                        while (data != -1) {
                            System.out.print((char) data);
                            data = read.read();
                        }
                    } catch (Exception ex) {
                    }
                }
            });

            Thread writerThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        write.write("I love my country\n".toCharArray());
                    } catch (Exception ex) {
                    }
                }
            });

            readerThread.start();
            writerThread.start();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
