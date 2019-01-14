/**
 * FileName: TestJavaCollection4
 * Author:   Lenovo
 * Date:     12/26/2018 10:59 AM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//Stack
import java.util.*;
public class TestJavaCollection4{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
