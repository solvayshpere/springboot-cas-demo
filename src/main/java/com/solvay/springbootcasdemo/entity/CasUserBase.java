package com.solvay.springbootcasdemo.entity;

import java.io.Serializable;

/**
 * (CasUserBase)实体类
 *
 * @author makejava
 * @since 2020-08-19 09:17:38
 */
public class CasUserBase implements Serializable {
    private static final long serialVersionUID = -70984959902041969L;
    
    private Integer id;
    
    private String userName;
    
    private String userPsd;
    
    private String userEmail;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPsd() {
        return userPsd;
    }

    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}