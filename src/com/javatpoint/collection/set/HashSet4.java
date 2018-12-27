/**
 * FileName: HashSet4
 * Author:   Lenovo
 * Date:     12/26/2018 4:31 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;


//Java HashSet from another Collection
import java.util.*;
class HashSet4{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        HashSet<String> set=new HashSet(list);
        set.add("Gaurav");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
