/**
 * FileName: EnumSetExample
 * Author:   Lenovo
 * Date:     12/26/2018 6:10 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.set;

////Java EnumSet Example
//import java.util.*;
//enum days {
//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//}
//public class EnumSetExample {
//    public static void main(String[] args) {
//        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
//        // Traversing elements
//        Iterator<days> iter = set.iterator();
//        while (iter.hasNext())
//            System.out.println(iter.next());
//    }
//}


//Java EnumSet Example: allOf() and noneOf()
import java.util.*;
enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetExample {
    public static void main(String[] args) {
        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:"+set1);
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:"+set2);
    }
}