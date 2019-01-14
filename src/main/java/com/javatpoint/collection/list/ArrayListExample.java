/**
 * FileName: ArrayListExample
 * Author:   Lenovo
 * Date:     12/26/2018 11:47 AM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Java ArrayList Example: Book3
import java.util.*;
class Book3 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book3(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ArrayListExample {
    public static void main(String[] args) {
        //Creating list of Book3s
        List<Book3> list=new ArrayList<Book3>();
        //Creating Book3s
        Book3 b1=new Book3(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book3 b2=new Book3(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book3 b3=new Book3(103,"Operating System","Galvin","Wiley",6);
        //Adding Book3s to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Book3 b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
