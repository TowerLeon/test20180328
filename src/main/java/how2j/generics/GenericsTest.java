/**
 * FileName: GenericsTest
 * Author:   Lenovo
 * Date:     1/23/2019 10:54 AM
 * Description:
 * History:
 */
package how2j.generics;

//根据数字类的知识，设计一个集合，这个集合里即可以放整数，也可以放浮点数，但是不能放字符串

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;




//public class GenericsTest<Integer,Float> {
//    public static void main(String[] args) {
//        List<GenericsTest> var = new ArrayList<>();
//        var.add(1);
//
//    }
//}


//public class GenericsTest<T> {
//    public static void main(String[] args) {
//        List<String> var = new ArrayList<>();
//        var.add("1");
//        var.add("2");
//        var.add("3");
//        System.out.println("The array is ");
//    }
//}

public class GenericsTest {
    public static void main(String[] args) {
        try {
            ArrayList<Number> numbers = new ArrayList<>();
            numbers.add(123);//int
            numbers.add(123f);//float
            numbers.add(123d);//double
//            numbers.add("String");
            for (Number i:numbers) {
                System.out.println(numbers.get((int) i));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}



//class HelloWorld
//{
//    static int a1 = 6;
//
//    public static void main(String[] args)
//    {
//        System.out.print(a1);
//    }
//}
//class HelloWorld1
//{
//    int a1 = 6;
//
//    public static void main(String[] args)
//    {
//        HelloWorld abc=new HelloWorld();
//        System.out.print(abc.a1);
//    }
//}
