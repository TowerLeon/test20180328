/**
 * FileName: Man
 * Author:   Lenovo
 * Date:     1/21/2019 5:32 PM
 * Description:
 * History:
 */

//http://www.cnblogs.com/huhx/p/serializable.html

package serializable;

//package com.huhx.model;
import java.io.Serializable;

public class Man implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;

    public Man(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}