/**
 * Copyright (C), 2015-2018, XXX���޹�˾
 * FileName: rectangle
 * Author:   Chris Li
 * Date:     4/7/2018 10:33 AM
 * Description: to calculate the square of a rectangle
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

/**
 /**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloWorld
 * Author:   Chris Li
 * Date:     3/28/2018 11:37 AM
 * Description: This class is used for test
 * 〈一句话功能简述〉<br>
 * 〈This class is used for test〉

 * @author Chris Li
 * @create 4/7/2018
 * @since 1.0.0
 */
//7.07
public class Rectangle {
    int length,width;
    public Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }
    public int area(){
        return length * width;
    }
    public static void main(String[] args){
        Rectangle obj = new Rectangle(3,4);
        System.out.println(obj.area());
    }
}
