/**
 * FileName: LinkedListExample
 * Author:   Lenovo
 * Date:     12/26/2018 1:45 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

////Java LinkedList Example: Book
//import java.util.*;
//class Book1 {
//    int id;
//    String name,author,publisher;
//    int quantity;
//    public Book1(int id, String name, String author, String publisher, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.quantity = quantity;
//    }
//}
//public class LinkedListExample {
//    public static void main(String[] args) {
//        //Creating list of Books
//        List<Book1> list=new LinkedList<Book1>();
//        //Creating Books
//        Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
//        Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
//        Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
//        //Adding Books to list
//        list.add(b1);
//        list.add(b2);
//        list.add(b3);
//        //Traversing list
//        for(Book1 b:list){
//            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
//        }
//    }
//}


//Java PriorityQueue Example: Book

import java.util.*;
class Book6 implements Comparable<Book6>{
    int id;
    String name,author,publisher;
    int quantity;
    public Book6(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(Book6 b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
public class LinkedListExample {
    public static void main(String[] args) {
        Queue<Book6> queue=new PriorityQueue<Book6>();
        //Creating Book6s  
        Book6 b1=new Book6(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book6 b2=new Book6(233,"Operating System","Galvin","Wiley",6);
        Book6 b3=new Book6(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding Book6s to the queue  
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements  
        for(Book6 b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        queue.remove();
        System.out.println("After removing one Book6 record:");
        for(Book6 b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}  