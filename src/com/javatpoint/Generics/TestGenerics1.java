/**
 * FileName: TestGenerics1
 * Author:   Lenovo
 * Date:     12/26/2018 9:30 PM
 * Description:
 * History:
 */
package com.javatpoint.Generics;

//Full Example of Generics in Java
import java.util.*;
class TestGenerics1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
//list.add(32);//compile time error

        String s=list.get(1);//type casting is not required
        System.out.println("element is: "+s);

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
