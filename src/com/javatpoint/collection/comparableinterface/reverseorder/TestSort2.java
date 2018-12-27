/**
 * FileName: TestSort2
 * Author:   Lenovo
 * Date:     12/26/2018 6:38 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.comparableinterface.reverseorder;

//Java Comparable Example: reverse order
import java.util.*;
public class TestSort2{
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
