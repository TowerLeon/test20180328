import java.util.*;

/**
 * FileName: Integer2Int
 * Author:   Lenovo
 * Date:     12/3/2018 2:26 PM
 * Description:
 * History:
 */

//8.6

public class Integer2Int {
    public static void main(String[] args) {
        Integer obj = new Integer(1);
        int obj2int = obj.intValue();

        System.out.println("The value of obj is" + obj2int);
    }
}

//8.7

class CompareChar {
    public static void main(String[] args) {
        Character char1 = 'A';
        Character char2 = 'a';
        System.out.println("Compare Character ojb:");
        if (char1.equals(char2)) {
            System.out.println("They are equal.");
        }
        else {
            System.out.println("They are not equal.");
        }
        Character char3 = Character.toLowerCase(char1);
        Character char4 = Character.toLowerCase(char2);
        System.out.println("Compare lower case character:");
        if (char3.equals(char4)) {
            System.out.println("They are equal.");
        }
        else {
            System.out.println("They are not equal.");
        }
    }
}

//8.8
class CharToString {
    public static void main(String[] args) {
        Boolean b = new Boolean(true);
        String s = b.toString();
        System.out.println("b is " + b);
        System.out.println("s is " + s);

    }
}

//10.11 //error
//abstract class AbsDemo {
//    public static void main(String[]args){
//    AbsDemo obj = new AbsDemo();
//
//        }
//        }

////10.12
//class Parent {
//    public void methodOne() {
//        System.out.println("parent method one");
//    }
//    public void methodTwo() {
//        System.out.println("parent method two");
//    }
////    public static void main(String[] args) {
////    Son son = new Son();
////    son.methodTwo();
////    }
//
//}
//
//class Son extends Parent {
//
//    @Override
//    public void methodTwo() {
//        System.out.println("son method two");
//    }
//
//    public static void main(String[] args) {
//        Son son = new Son();
//        son.methodTwo();
//    }
//
//}

////10.13
//class Parent {
//    public Parent() {
//        System.out.println("Parent constructor");
//    }
//    String var1 = "var1";
//    public void parentMethodOne() {
//        System.out.println("parentMethodOne");
//    }
//}
//
//class Son extends Parent {
//    public Son() {
//        System.out.println("Son constructor");
//    }
//    String var2 = "var2";
//    public void sonMethodTwo() {
//        System.out.println("sonMethodTwo");
//    }
//
//    public static void main(String[] args) {
//        Parent obj1 = new Parent();
//        Son obj2 = new Son();
//    }
//}

//12.09
//class MyException extends Exception {
//    public MyException(String errorMessage) {
//        super(errorMessage);
//    }
//}
//
//class Student {
//    public int speak(int m) throws MyException {
//        if(m > 1000) {
//            throw new MyException("m is too large.");
//        }
//        else return m;
//    }
//}
//
//class MainClass {
//    public static void main(String[] args) {
//        Student s = new Student();
//        try {
//            System.out.println(s.speak(1001));
//        }
//        catch (MyException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//12.10
//class Number {
//    public int count(int a,int b) {
//        return a * b;
//    }
//}
//class MainClass {
//    public static void main(String[] args) throws Exception {
//        Number n = new Number();
//        try {
//            n.count(4,3);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

//12.11
//class MyException extends Exception {
//    public MyException(String errorMessage) {
//        super(errorMessage);
//    }
//}
//class Computer {
//    public int calMax(int a,int b) throws MyException {
//        if(a < 0 | b < 0) {
//            throw new MyException("a or b is minus.");
//        }
//        else { return a * b;}
//    }
//
//    public static void main(String[] args) {
//        Computer c = new Computer();
//        try {
//            c.calMax(-3,4);
//        }
//        catch (MyException e) {
//            e.printStackTrace();
//        }
//    }
//}

//14.06
//class CreateList {
//    public static void main(String[] args) {
//        List<Integer> li = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            li.add(i);
//        }
//        li.remove(10);
//        for (Integer element:
//             li) {
//            System.out.print(li);
//        }
//        System.out.println();
//    }
//}

//14.07
//class CreateList {
//    public static void main(String[] args) {
//        List<Character> list = new ArrayList<>();
//        list.add('A');
//        list.add('a');
//        list.add('c');
//        list.add('C');
//        list.add('a');
//    }
//}
//class CreateSet {
//    public static void main(String[] args) {
//        Set<Character> set = new HashSet<>();
//        set.add('A');
//        set.add('a');
//        set.add('c');
//        set.add('C');
//        set.add('a');
//    }
//}

//14.08
class Emp {
    public String id;
    public String name;

    public Emp(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CreateMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Emp emp1 = new Emp("001","001");
        Emp emp2 = new Emp("002","002");
        Emp emp3 = new Emp("003","003");
        Emp emp4 = new Emp("004","004");
        Emp emp5 = new Emp("005","005");
        map.put(emp1.getId(),emp1.getName());
        map.put(emp2.getId(),emp2.getName());
        map.put(emp3.getId(),emp3.getName());
        map.put(emp4.getId(),emp4.getName());
        map.put(emp5.getId(),emp5.getName());
        map.remove(emp4.getId());
        for (String string:
             map.keySet()) {
            System.out.println(map.get(string));
        }
    }

}