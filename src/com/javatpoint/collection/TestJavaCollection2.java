/**
 * FileName: TestJavaCollection2
 * Author:   Lenovo
 * Date:     12/26/2018 10:55 AM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//LinkedList
import java.util.*;
public class TestJavaCollection2{
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
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
