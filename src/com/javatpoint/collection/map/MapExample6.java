/**
 * FileName: MapExample6
 * Author:   Lenovo
 * Date:     12/26/2018 5:15 PM
 * Description:
 * History:
 */
package com.javatpoint.collection.map;


//Java Map Example: comparingByValue() in Descending Order
import java.util.*;
class MapExample6{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}