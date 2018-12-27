/**
 * FileName: HashSet2
 * Author:   Lenovo
 * Date:     12/26/2018 4:23 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;


//Java HashSet example ignoring duplicate elements
import java.util.*;
class HashSet2{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}