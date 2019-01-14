/**
 * FileName: io
 * Author:   Lenovo
 * Date:     12/29/2018 3:17 PM
 * Description:
 * History:
 */
package sl;


import java.io.*;

public class io {
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
                byte[] foutByte = "a text by FileOutputStream.".getBytes();
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
//FileWriter -- FileReader and BufferedWriter -- BufferedReader
        if(file.exists()) {
            try {
                String fwString = "a text by FileWriter.";
                FileWriter fw = new FileWriter(file);
                fw.write(fwString);
                fw.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String frString = br.readLine();
                System.out.println("This text is " + frString);
                fr.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
//DataOutputStream and DataInputStream
        if(file.exists()) {
            try {
                FileOutputStream fout = new FileOutputStream(file);
                DataOutputStream dout = new DataOutputStream(fout);
                dout.writeUTF("a text by writeUTF");
                dout.writeBytes("a text by writeBytes.");
                dout.writeChars("a text by writeChars.");
                dout.close();
                FileInputStream fin = new FileInputStream(file);
                DataInputStream din = new DataInputStream(fin);
                String dinString = din.readUTF();
                System.out.println("This is " +dinString);
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
}
