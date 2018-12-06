/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: java_exam
 * Author:   Chris Li
 * Date:     8/8/2018 8:43 PM
 * Description: java_exam
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈java_exam〉
 *
 * @author Chris Li
 * @create 8/8/2018
 * @since 1.0.0
 */

/*No.1*/
//import javax.swing.JOptionPane;  //导入JOptionPane类
//
//    public class JavaExam {
//        public static void main( String args[] )
//        {
////*********Found********
//            JOptionPane.showMessageDialog(
//                    null, "欢迎\n你\n参加\nJava\n考试!" );
//            System.exit( 0 );  // 结束程序
//                    }
//
//
//    }
/* JOptionPane类的常用静态方法如下：
   showInputDialog()
   showConfirmDialog()
   showMessageDialog()
   showOptionDialog()
*/

/*No.2*/
//*********Found********
//import java.applet.*;
//import java.awt.Graphics;
//
////*********Found********
//public class JavaExam extends Applet {
//@Override
//    public void paint( Graphics g )
//    {
////*********Found********
//        g.drawString( "欢迎你来参加Java 语言考试!", 25, 25 );
//    }
//}
/*No3*/
//import java.applet.*;
//import java.awt.Graphics;
//
////*********Found********
//public class JavaExam extends Applet {
//@Override
//    public void paint( Graphics g )
//    {
////*********Found********
//        g.drawString( "欢迎你来参加Java 语言考试!", 25, 25 );
//    }
//}


/*No4*/
//*********Found**********
//import javax.swing.JOptionPane;
//
//public class JavaExam{
//    public static void main( String args[] ){
//        String s1, s2, s3, s4, output;
//        s1 = new String( "hello" );
//        s2 = new String( "good bye" );
//        s3 = new String( "Happy Birthday" );
//        s4 = new String( "happy birthday" );
//        output = "s1 = " + s1 + "\ns2 = " + s2 +
//                "\ns3 = " + s3 + "\ns4 = " + s4 + "\n\n";
//        //测试字符串相等
//        if ( s1.equals( "hello" ) )
//            //*********Found**********
//            output = output + "s1 equals \"hello\"\n";
//        else
//            output = output + "s1 does not equal \"hello\"\n";
//        //用==测试相等
//        if ( s1 == "hello" )
//            output += "s1 equals \"hello\"\n";
//        else
//            output += "s1 does not equal \"hello\"\n";
//        //忽略字符格式测试相等
//        if ( s3.equalsIgnoreCase( s4 ) )
//            output += "s3 equals s4\n";
//        else
//            output += "s3 does not equal s4\n";
//        //内容比较
//        output +=
//                "\ns1.compareTo( s2 ) is " + s1.compareTo( s2 ) +
//                        "\ns2.compareTo( s1 ) is " + s2.compareTo( s1 ) +
//                        "\ns1.compareTo( s1 ) is " + s1.compareTo( s1 ) +
//                        "\ns3.compareTo( s4 ) is " + s3.compareTo( s4 ) +
//                        "\ns4.compareTo( s3 ) is " + s4.compareTo( s3 ) +
//                        "\n\n";
//        //测试包含字符格式的域匹配
//        if ( s3.regionMatches( 0, s4, 0, 5 ) )
//            output += "First 5 characters of s3 and s4 match\n";
//        else
//            output +=
//                    "First 5 characters of s3 and s4 do not match\n";
//        //忽略字符格式的域匹配
//        if ( s3.regionMatches( true, 0, s4, 0, 5 ) )
//            output += "First 5 characters of s3 and s4 match";
//        else
//            output +=
//                    "First 5 characters of s3 and s4 do not match";
//        //*********Found**********
//        JOptionPane.showMessageDialog( null, output,
//                "字符串构造方法示例",
//                JOptionPane.INFORMATION_MESSAGE );
//        System.exit( 0 );
//    }
//}


/*No6*/
public class JavaExam{
    //*********Found**********
    public static void main(String args[]){
        String string="现在学习如何访问一个字符串";
        System.out.println("字符串 \""+string+"\"");
        //*********Found**********
        System.out.println("字符串长度："+string.length());
        //*********Found**********
        System.out.println("其中第7个字符是："+string.charAt(6));
        char sub[] = new char[20];
        System.out.print("从字节数组的第7到12获取字符是：");
        string.getChars(6,12,sub,0);
        System.out.println(sub);
    }
}
