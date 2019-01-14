/**
 * FileName: TestSort4
 * Author:   Lenovo
 * Date:     12/26/2018 6:30 PM
 * Description:
 * History:
 */
package com.javatpoint.collection;

//Example to sort user-defined class objects
import java.util.*;

class Student implements Comparable<Student> {
    public String name;
    public Student(String name) {
        this.name = name;
    }
    public int compareTo(Student person) {
        return name.compareTo(person.name);

    }
}
public class TestSort4 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student("Viru"));
        al.add(new Student("Saurav"));
        al.add(new Student("Mukesh"));
        al.add(new Student("Tahir"));

        Collections.sort(al);
        for (Student s : al) {
            System.out.println(s.name);
        }
    }
}
