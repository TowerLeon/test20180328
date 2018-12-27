/**
 * FileName: MyGen
 * Author:   Lenovo
 * Date:     12/27/2018 9:36 AM
 * Description:
 * History:
 */
package com.javatpoint.Generics;

//Creating generic class:
class MyGen<T>{
    T obj;
    void add(T obj){this.obj=obj;}
    T get(){return obj;}
}