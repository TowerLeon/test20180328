/**
 * FileName: HashtableExample
 * Author:   Lenovo
 * Date:     12/26/2018 6:04 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.map;

import java.util.*;
class Book11 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book11(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class HashtableExample {
    public static void main(String[] args) {
        //Creating map of Book11s    
        Map<Integer,Book11> map=new Hashtable<Integer,Book11>();
        //Creating Book11s    
        Book11 b1=new Book11(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book11 b2=new Book11(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book11 b3=new Book11(103,"Operating System","Galvin","Wiley",6);
        //Adding Book11s to map   
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map  
        for(Map.Entry<Integer, Book11> entry:map.entrySet()){
            int key=entry.getKey();
            Book11 b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}    
