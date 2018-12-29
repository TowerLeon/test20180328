/**
 * FileName: LinkedHashMap2
 * Author:   Lenovo
 * Date:     12/26/2018 5:31 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.map;


//Java LinkedHashMap Example: Key-Value pair
import java.util.*;
class LinkedHashMap2{
    public static void main(String args[]){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());
    }
}