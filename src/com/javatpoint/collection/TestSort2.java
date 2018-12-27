/**
 * FileName: TestSort2
 * Author:   Lenovo
 * Date:     12/26/2018 6:28 PM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//Example to sort string objects in reverse order
import java.util.*;
class TestSort2{
    public static void main(String args[]){

        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al,Collections.reverseOrder());
        Iterator i=al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
