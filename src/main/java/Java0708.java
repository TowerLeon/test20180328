/**
 * FileName: Java0708
 * Author:   Lenovo
 * Date:     8/22/2019 10:21 PM
 * Description:
 * History:
 */

public class Java0708 {
}


class ObjectInstance {
    int a = 1;
    @Override
    public String toString() {//重写toString()方法
        int b = 1;
        return "在" + getClass().getName() + "类中重写toString()方法";
    }
    public static void main(String[] args) {
        System.out.println(new ObjectInstance()); 	//打印本类对象
    }
}
