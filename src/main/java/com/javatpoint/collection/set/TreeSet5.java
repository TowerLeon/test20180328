/**
 * FileName: TreeSet5
 * Author:   Lenovo
 * Date:     12/26/2018 4:42 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;


//Java TreeSet Example 5:
import java.util.*;
class TreeSet5{
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Intial Set: "+set);

        System.out.println("Head Set: "+set.headSet("C"));

        System.out.println("SubSet: "+set.subSet("A", "E"));

        System.out.println("TailSet: "+set.tailSet("C"));
    }
}
