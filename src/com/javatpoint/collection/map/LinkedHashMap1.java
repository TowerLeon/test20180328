/**
 * FileName: LinkedHashMap1
 * Author:   Lenovo
 * Date:     12/26/2018 5:30 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.map;

//Java LinkedHashMap Example
import java.util.*;
class LinkedHashMap1{
    public static void main(String args[]){

        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
