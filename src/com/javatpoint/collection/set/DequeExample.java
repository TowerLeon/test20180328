/**
 * FileName: DequeExample
 * Author:   Lenovo
 * Date:     12/26/2018 4:56 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;


//Java ArrayDeque Example: offerFirst() and pollLast()
import java.util.*;
public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
    }
}
