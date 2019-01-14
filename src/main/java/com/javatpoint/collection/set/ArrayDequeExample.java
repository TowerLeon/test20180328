/**
 * FileName: ArrayDequeExample
 * Author:   Lenovo
 * Date:     12/26/2018 4:53 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;

////Java ArrayDeque Example
//import java.util.*;
//public class ArrayDequeExample {
//    public static void main(String[] args) {
//        //Creating Deque and adding elements
//        Deque<String> deque = new ArrayDeque<String>();
//        deque.add("Ravi");
//        deque.add("Vijay");
//        deque.add("Ajay");
//        //Traversing elements
//        for (String str : deque) {
//            System.out.println(str);
//        }
//    }
//}


//Java ArrayDeque Example: Book
import java.util.*;
class Book7 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book7(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Book7> set=new ArrayDeque<Book7>();
        //Creating Book7s    
        Book7 b1=new Book7(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book7 b2=new Book7(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book7 b3=new Book7(103,"Operating System","Galvin","Wiley",6);
        //Adding Book7s to Deque   
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing ArrayDeque  
        for(Book7 b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}    
