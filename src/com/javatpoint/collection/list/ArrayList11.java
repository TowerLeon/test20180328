/**
 * FileName: ArrayList11
 * Author:   Lenovo
 * Date:     12/26/2018 11:46 AM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Java ArrayList example of set() and get() method
import java.util.*;
class ArrayList11 {

    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("Before update: "+al.get(1));
        //Updating an element at specific position
        al.set(1,"Gaurav");
        System.out.println("After update: "+al.get(1));
    }
}
