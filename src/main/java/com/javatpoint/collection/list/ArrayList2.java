/**
 * FileName: ArrayList2
 * Author:   Lenovo
 * Date:     12/26/2018 11:34 AM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Iterating Collection through Iterator interface
import java.util.*;
class ArrayList2{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
