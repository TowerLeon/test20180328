/**
 * FileName: TestJavaCollection3
 * Author:   Lenovo
 * Date:     12/26/2018 10:57 AM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//Vector
import java.util.*;
public class TestJavaCollection3{
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}