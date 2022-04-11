/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.htl.services;

import com.htl.pojo.User;
import com.htl.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huynh
 */
public class UserServices {
    public List<User> getListUser () throws SQLException{
        List<User> Accounts = new ArrayList<>();
        try(Connection conn= JDBCUtils.getConn()){
            String sql = "SELECT * FROM user";           
            PreparedStatement stm=conn.prepareStatement(sql);           
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                User s = new User();
                s.setId(rs.getInt("id"));
                s.setUserName(rs.getString("username"));
                s.setPassword(rs.getString("password"));
                s.setUserRole(rs.getString("userrole"));
                Accounts.add(s);
            }
        }
        return Accounts;
    }
}
