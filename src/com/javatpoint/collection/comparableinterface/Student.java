/**
 * FileName: Student
 * Author:   Lenovo
 * Date:     12/26/2018 6:33 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.comparableinterface;

//Java Comparable Example
class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
