/**
 * FileName: ObjectStreamClassExample
 * Author:   Lenovo
 * Date:     12/27/2018 2:26 PM
 * Description:
 * History:
 */
package com.javatpoint.io.objectstreamfield;

//Example
import java.io.ObjectStreamClass;
import java.util.Calendar;

public class ObjectStreamClassExample {
    public static void main(String[] args) {

        // create a new object stream class for Integers
        ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);

        // get the value field from ObjectStreamClass for integers
        System.out.println("" + osc.getField("value"));

        // create a new object stream class for Calendar
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);

        // get the Class instance for osc2
        System.out.println("" + osc2.getField("isTimeSet"));

    }
}