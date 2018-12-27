/**
 * FileName: ArrayList9
 * Author:   Lenovo
 * Date:     12/26/2018 11:45 AM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Java ArrayList example of retainAll() method
import java.util.*;
class ArrayList9{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.retainAll(al2);
        System.out.println("iterating the elements after retaining the elements of al2");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}