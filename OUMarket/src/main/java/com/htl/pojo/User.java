/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.htl.pojo;

/**
 *
 * @author huynh
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String userRole;
    
    public User(){
        
    }
    public User(int id, String username, String password, String userRole){
        this.id = id;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }
    public User(String username, String password, String userRole){
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getUsername(){
        return username;
    }
    public void setUserName(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUserrole(){
        return userRole;
    }
    public void setUserRole(String userRole){
        this.userRole = userRole;
    }
    
    
    
}
