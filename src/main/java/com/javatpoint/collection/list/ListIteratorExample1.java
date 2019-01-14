/**
 * FileName: ListIteratorExample1
 * Author:   Lenovo
 * Date:     12/26/2018 4:16 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.list;

//Example of ListIterator Interface
import java.util.*;
public class ListIteratorExample1{
    public static void main(String args[]){
        List<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        ListIterator<String> itr=al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){

            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){

            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
    }
}
