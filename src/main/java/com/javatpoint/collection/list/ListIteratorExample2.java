/**
 * FileName: ListIteratorExample2
 * Author:   Lenovo
 * Date:     12/26/2018 4:20 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;


//Example of ListIterator Interface: Book
import java.util.*;
class Book2 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book2(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ListIteratorExample2 {
    public static void main(String[] args) {
        //Creating list of Book2s  
        List<Book2> list=new ArrayList<Book2>();
        //Creating Book2s  
        Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book2 b2=new Book2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6);
        //Adding Book2s to list  
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list  
        for(Book2 b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}  