/**
 * FileName: HashTable2
 * Author:   Lenovo
 * Date:     12/26/2018 5:55 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.map;

//Java Hashtable Example: remove()
import java.util.*;
public class HashTable2 {
    public static void main(String args[]) {
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Before remove: "+ map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("After remove: "+ map);
    }
}
