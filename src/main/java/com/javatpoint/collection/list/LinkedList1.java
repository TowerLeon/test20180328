/**
 * FileName: LinkedList1
 * Author:   Lenovo
 * Date:     12/26/2018 1:40 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Java LinkedList Example
import java.util.*;
public class LinkedList1{
    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
