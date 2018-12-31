/**
 * FileName: FindMaxAndMinFolder
 * Author:   Lenovo
 * Date:     12/29/2018 3:17 PM
 * Description:
 * History:
 */
package how2j;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FindMaxAndMinFolder {
    public static void main(String[] args) {
//create new file or delete existed file
        File file = new File("file.txt");
        System.out.println("File absolute path is " + file.getAbsolutePath());
        if(file.exists()) {
            file.delete();
            System.out.println("File has been deleted.");
        }
        else {
            try {
                file.createNewFile();
                System.out.println("File has been created.");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
//export attribute
            if (file.exists()) {
                String name = file.getName();
                long length = file.length();
                boolean isHidden = file.isHidden();
                System.out.println("File name is " + name);
                System.out.println("File length is " + length);
                System.out.println("File isHidden status is " + isHidden);
            }
        }
//output stream and input stream
        if (file.exists()) {
            try {
                FileOutputStream fout = new FileOutputStream(file);
                byte[] foutByte = "This is a String.".getBytes();
                fout.write(foutByte);
                fout.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            try {
                FileInputStream fin = new FileInputStream(file);
                byte[] finByte = new byte[1024];
                int len = fin.read(finByte); //return length,but is necessary to associate fin with finByte
                System.out.println("The text is " + new String(finByte));
                fin.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }
//FileWriter and FileReader
        if(file.exists()) {
            try {
                
            }
        }


    }
}
