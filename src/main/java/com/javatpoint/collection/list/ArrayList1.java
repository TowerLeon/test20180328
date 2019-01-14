/**
 * FileName: ArrayList1
 * Author:   Lenovo
 * Date:     12/26/2018 11:29 AM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Java ArrayList Example
import java.util.*;
class ArrayList1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //Invoking arraylist object
        System.out.println(list);
    }
}

