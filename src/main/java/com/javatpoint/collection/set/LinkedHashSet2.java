/**
 * FileName: LinkedHashSet2
 * Author:   Lenovo
 * Date:     12/26/2018 4:34 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;

//Java LinkedHashSet example ignoring duplicate Elements
import java.util.*;
class LinkedHashSet2{
    public static void main(String args[]){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
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