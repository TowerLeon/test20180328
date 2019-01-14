/**
 * FileName: TestGenerics4
 * Author:   Lenovo
 * Date:     12/27/2018 10:34 AM
 * Description:
 * History:
 */
package com.javatpoint.Generics;

//Generic Method
public class TestGenerics4{

    public static < E > void printArray(E[] elements) {
        for ( E element : elements){
            System.out.println(element );
        }
        System.out.println();
    }
    public static void main( String args[] ) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };

        System.out.println( "Printing Integer Array" );
        printArray( intArray  );

        System.out.println( "Printing Character Array" );
        printArray( charArray );
    }
}