/**
 * FileName: CollectionsExample
 * Author:   Lenovo
 * Date:     12/26/2018 6:20 PM
 * Description:
 * History:
 */
package com.javatpoint.collection;

////Java Collections Example
//import java.util.*;
//public class CollectionsExample {
//    public static void main(String a[]){
//        List<String> list = new ArrayList<String>();
//        list.add("C");
//        list.add("Core Java");
//        list.add("Advance Java");
//        System.out.println("Initial collection value:"+list);
//        Collections.addAll(list, "Servlet","JSP");
//        System.out.println("After adding elements collection value:"+list);
//        String[] strArr = {"C#", ".Net"};
//        Collections.addAll(list, strArr);
//        System.out.println("After adding array collection value:"+list);
//    }
//}

////Java Collections Example: max()
//import java.util.*;
//public class CollectionsExample {
//    public static void main(String a[]){
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(46);
//        list.add(67);
//        list.add(24);
//        list.add(16);
//        list.add(8);
//        list.add(12);
//        System.out.println("Value of maximum element from the collection: "+Collections.max(list));
//    }
//}

//Java Collections Example: min()
import java.util.*;
public class CollectionsExample {
    public static void main(String a[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(46);
        list.add(67);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);
        System.out.println("Value of minimum element from the collection: "+Collections.min(list));
    }
}