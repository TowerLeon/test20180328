/**
 * FileName: TestJavaCollection1
 * Author:   Lenovo
 * Date:     12/26/2018 10:43 AM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//ArrayList
import java.util.*;
class TestJavaCollection1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
