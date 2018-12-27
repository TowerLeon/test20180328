/**
 * FileName: ReadStringTest
 * Author:   Lenovo
 * Date:     12/27/2018 2:40 PM
 * Description:
 * History:
 */
package com.javatpoint.io.console;

//Java Console Example
import java.io.Console;
class ReadStringTest{
    public static void main(String args[]){
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
    }
}