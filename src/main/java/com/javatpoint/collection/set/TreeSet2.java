/**
 * FileName: TreeSet2
 * Author:   Lenovo
 * Date:     12/26/2018 4:38 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;

//Java TreeSet Example 2:
import java.util.*;
class TreeSet2{
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=set.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
