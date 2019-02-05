import java.util.Random;

/**
 * FileName: Gen16Digits
 * Author:   Lenovo
 * Date:     1/30/2019 10:07 AM
 * Description:
 * History:
 */

//public class Gen16Digits {
//
//    public static void main(String[] args) {
//        Random ran = new random();
//        int a=ran.nextInt(99999999);
//        int b=ran.nextInt(99999999);
//        long l=a*10000000L+b;
//        String num=String.valueOf(l);
//    }
//
//}


import java.util.UUID;

class randomStringGenerator {
    public static void main(String[] args) {
        System.out.println(generateString());
    }

    public static String generateString() {
        String uuid = UUID.randomUUID().toString().replace("-","").substring(0,16);
        return "uuid = " + uuid;
    }
}