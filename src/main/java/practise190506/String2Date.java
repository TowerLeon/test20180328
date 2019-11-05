/**
 * FileName: String2Date
 * Author:   Lenovo
 * Date:     10/6/2019 4:27 PM
 * Description:
 * History:
 */
package practise190506;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2Date {
    public static void main(String[] args) throws ParseException {
        String string = "2019-09-09 13:13:13";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = formatter.parse(string);
        System.out.println("The string2date is : " + date);
    }
}
