/**
 * FileName: MapExample
 * Author:   Lenovo
 * Date:     12/26/2018 5:26 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.map;


//import java.util.*;
//class Book8 {
//    int id;
//    String name,author,publisher;
//    int quantity;
//    public Book8(int id, String name, String author, String publisher, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.quantity = quantity;
//    }
//}
//public class MapExample {
//    public static void main(String[] args) {
//        //Creating map of Book8s
//        Map<Integer,Book8> map=new HashMap<Integer,Book8>();
//        //Creating Book8s
//        Book8 b1=new Book8(101,"Let us C","Yashwant Kanetkar","BPB",8);
//        Book8 b2=new Book8(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
//        Book8 b3=new Book8(103,"Operating System","Galvin","Wiley",6);
//        //Adding Book8s to map
//        map.put(1,b1);
//        map.put(2,b2);
//        map.put(3,b3);
//
//        //Traversing map
//        for(Map.Entry<Integer, Book8> entry:map.entrySet()){
//            int key=entry.getKey();
//            Book8 b=entry.getValue();
//            System.out.println(key+" Details:");
//            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
//        }
//    }
//}


//
//import java.util.*;
//class Book9 {
//    int id;
//    String name,author,publisher;
//    int quantity;
//    public Book9(int id, String name, String author, String publisher, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.quantity = quantity;
//    }
//}
//public class MapExample {
//    public static void main(String[] args) {
//        //Creating map of Book9s
//        Map<Integer,Book9> map=new LinkedHashMap<Integer,Book9>();
//        //Creating Book9s
//        Book9 b1=new Book9(101,"Let us C","Yashwant Kanetkar","BPB",8);
//        Book9 b2=new Book9(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
//        Book9 b3=new Book9(103,"Operating System","Galvin","Wiley",6);
//        //Adding Book9s to map
//        map.put(2,b2);
//        map.put(1,b1);
//        map.put(3,b3);
//
//        //Traversing map
//        for(Map.Entry<Integer, Book9> entry:map.entrySet()){
//            int key=entry.getKey();
//            Book9 b=entry.getValue();
//            System.out.println(key+" Details:");
//            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
//        }
//    }
//}


//Java TreeMap Example: Book
import java.util.*;
class Book10 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book10(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class MapExample {
    public static void main(String[] args) {
        //Creating map of Book10s    
        Map<Integer,Book10> map=new TreeMap<Integer,Book10>();
        //Creating Book10s    
        Book10 b1=new Book10(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book10 b2=new Book10(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book10 b3=new Book10(103,"Operating System","Galvin","Wiley",6);
        //Adding Book10s to map   
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        //Traversing map  
        for(Map.Entry<Integer, Book10> entry:map.entrySet()){
            int key=entry.getKey();
            Book10 b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}    