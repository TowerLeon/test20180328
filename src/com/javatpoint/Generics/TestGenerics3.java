/**
 * FileName: TestGenerics3
 * Author:   Lenovo
 * Date:     12/27/2018 10:19 AM
 * Description:
 * History:
 */
package com.javatpoint.Generics;

//Using generic class:
class TestGenerics3{
    public static void main(String args[]){
        MyGen<Integer> m=new MyGen<Integer>();
        m.add(2);
//m.add("vivek");//Compile time error
        System.out.println(m.get());
    }}