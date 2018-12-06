/**
 * Copyright (C), 2015-2018, XXX���޹�˾
 * FileName: Loop
 * Author:   Chris Li
 * Date:     4/7/2018 11:16 AM
 * Description: to export how many times a variable is used
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈to export how many times a variable is used〉
 *
 * @author Chris Li
 * @create 3/28/2018
 * @since 1.0.0
 */
//7.08
public class Loop {
    int para;
    public Loop(int para){
        this.para = para;
    }
    public void printLoop(){
        for(int i=0;i <= para;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Loop obj = new Loop(10);
        obj.printLoop();
    }
}
