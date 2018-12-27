/**
 * FileName: TestJavaCollection8
 * Author:   Lenovo
 * Date:     12/26/2018 11:07 AM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//LinkedHashSet
import java.util.*;
public class TestJavaCollection8{
    public static void main(String args[]){
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
