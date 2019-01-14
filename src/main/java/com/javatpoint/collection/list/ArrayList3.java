/**
 * FileName: ArrayList3
 * Author:   Lenovo
 * Date:     12/26/2018 11:36 AM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Iterating Collection through the for-each loop
import java.util.*;
class ArrayList3{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing list through for-each loop
        for(String obj:al)
            System.out.println(obj);
    }
}
