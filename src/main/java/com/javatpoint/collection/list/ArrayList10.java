/**
 * FileName: ArrayList10
 * Author:   Lenovo
 * Date:     12/26/2018 11:45 AM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Java ArrayList example of isEmpty() method
import java.util.*;
class ArrayList10{

    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
    }
}
