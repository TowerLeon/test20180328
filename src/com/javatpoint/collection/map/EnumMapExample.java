/**
 * FileName: EnumMapExample
 * Author:   Lenovo
 * Date:     12/26/2018 6:14 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.map;

////Java EnumMap Example
//import java.util.*;
//public class EnumMapExample {
//    // create an enum
//    public enum Days {
//        Monday, Tuesday, Wednesday, Thursday
//    };
//    public static void main(String[] args) {
//        //create and populate enum map
//        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
//        map.put(Days.Monday, "1");
//        map.put(Days.Tuesday, "2");
//        map.put(Days.Wednesday, "3");
//        map.put(Days.Thursday, "4");
//        // print the map
//        for(Map.Entry m:map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//    }
//}



//Java EnumMap Example: Book12
import java.util.*;
class Book12 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book12(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class EnumMapExample {
    // Creating enum
    public enum Key{
        One, Two, Three
    };
    public static void main(String[] args) {
        EnumMap<Key, Book12> map = new EnumMap<Key, Book12>(Key.class);
        // Creating Book12s
        Book12 b1=new Book12(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book12 b2=new Book12(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book12 b3=new Book12(103,"Operating System","Galvin","Wiley",6);
        // Adding Book12s to Map
        map.put(Key.One, b1);
        map.put(Key.Two, b2);
        map.put(Key.Three, b3);
        // Traversing EnumMap
        for(Map.Entry<Key, Book12> entry:map.entrySet()){
            Book12 b=entry.getValue();
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}