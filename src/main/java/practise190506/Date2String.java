/**
 * FileName: Date2String
 * Author:   Lenovo
 * Date:     10/6/2019 4:43 PM
 * Description:
 * History:
 */
package practise190506;

import java.io.DataInputStream;
import java.net.SocketImpl;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2String {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String string = formatter.format(date);
        System.out.println("The date2string is : " + string);
    }
}
