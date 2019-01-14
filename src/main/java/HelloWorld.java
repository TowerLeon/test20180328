/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloWorld
 * Author:   Chris Li
 * Date:     3/28/2018 11:37 AM
 * Description: This class is used for test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈This class is used for test〉
 *
 * @author Chris Li
 * @create 3/28/2018
 * @since 1.0.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        String s = "good";
        System.out.println(s);
        String snew = new String("bad");
        System.out.println(snew);
        String s1 = new String("Hello");
        String s2 = new String("World!");
        System.out.println(s1 + " " + s2);
        //to exchange row and column
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("The original array is:");
        for(int i = 0;i < arr1.length;i ++)
        {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("The exchanged array is:");
        for(int i = 0;i < arr1.length;i++){
            for(int j=0;j < i+1;j++){
                if(i!=j){
                    int temp = arr1[i][j];
                    arr1[i][j] = arr1[j][i];
                    arr1[j][i] = temp;
                }
            }
        }
        for(int i = 0;i < arr1.length;i ++)
        {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }

}

