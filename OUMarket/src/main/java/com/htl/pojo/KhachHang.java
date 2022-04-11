/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.htl.pojo;

import java.time.LocalDate;

/**
 *
 * @author huynh
 */
public class KhachHang {
    private int id;
    private String tenKH;
    private LocalDate ngayThamGia;
    
    public KhachHang(){
        
    }
    public KhachHang(int id, String tenKH, LocalDate ngayThamGia){
        this.id = id;
        this.tenKH = tenKH;
        this.ngayThamGia = ngayThamGia;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getTenKH(){
        return tenKH;
    }
    public void setTenKH(String tenKH){
        this.tenKH = tenKH;
    }
    public LocalDate getNgayThamGia(){
        return ngayThamGia;
    }
    public void setNgayThamGia(){
        this.ngayThamGia = ngayThamGia;
    }
}
