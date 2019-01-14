/**
 * FileName: TestSort3
 * Author:   Lenovo
 * Date:     12/26/2018 6:29 PM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//Example to sort Wrapper class objects
import java.util.*;
class TestSort3{
    public static void main(String args[]){

        ArrayList al=new ArrayList();
        al.add(Integer.valueOf(201));
        al.add(Integer.valueOf(101));
        al.add(230);//internally will be converted into objects as Integer.valueOf(230)

        Collections.sort(al);

        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
