/**
 * FileName: ListExample
 * Author:   Lenovo
 * Date:     12/26/2018 1:57 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Java List Example
import java.util.*;
public class ListExample{
    public static void main(String args[]){
        List<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        System.out.println("An element at 2nd position: "+al.get(2));
        for(String s:al){
            System.out.println(s);
        }
    }
}
