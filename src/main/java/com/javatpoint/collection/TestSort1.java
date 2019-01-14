/**
 * FileName: TestSort1
 * Author:   Lenovo
 * Date:     12/26/2018 6:28 PM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//Example to sort string objects
import java.util.*;
class TestSort1{
    public static void main(String args[]){

        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
