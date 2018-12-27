/**
 * FileName: TreeSetExample
 * Author:   Lenovo
 * Date:     12/26/2018 4:43 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;


//Java TreeSet Example: Book5
import java.util.*;
class Book5 implements Comparable<Book5>{
    int id;
    String name,author,publisher;
    int quantity;
    public Book5(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(Book5 b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
public class TreeSetExample {
    public static void main(String[] args) {
        Set<Book5> set=new TreeSet<Book5>();
        //Creating Book5s
        Book5 b1=new Book5(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book5 b2=new Book5(233,"Operating System","Galvin","Wiley",6);
        Book5 b3=new Book5(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding Book5s to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing TreeSet
        for(Book5 b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
