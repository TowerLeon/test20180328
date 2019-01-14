/**
 * FileName: TestJavaCollection7
 * Author:   Lenovo
 * Date:     12/26/2018 11:06 AM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//HashSet
import java.util.*;
public class TestJavaCollection7{
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
