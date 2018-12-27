/**
 * FileName: FilePermissionExample
 * Author:   Lenovo
 * Date:     12/25/2018 5:45 PM
 * Description:
 * History:
 */
package com.javatpoint.io.filepermission;

//Java FilePermission Example
import java.io.*;
import java.security.PermissionCollection;
public class FilePermissionExample{
    public static void main(String[] args) throws IOException {
        String srg = "D:\\IO Package\\java.txt";
        FilePermission file1 = new FilePermission("D:\\IO Package\\-", "read");
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);
        FilePermission file2 = new FilePermission(srg, "write");
        permission.add(file2);
        if(permission.implies(new FilePermission(srg, "read,write"))) {
            System.out.println("Read, Write permission is granted for the path "+srg );
        }else {
            System.out.println("No Read, Write permission is granted for the path "+srg);            }
    }
}
