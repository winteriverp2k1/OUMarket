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
public class HoaDon {
    private int id;
    private LocalDate ngayXuatDon;
    private int maNV;
    private int maKH;
    
    public HoaDon(){
        
    }
    public HoaDon(int id, LocalDate ngayXuatDon, int maNV, int maKH){
        this.id = id;
        this.ngayXuatDon = ngayXuatDon;
        this.maNV = maNV;
        this.maKH = maKH;
    }
    public HoaDon(int id, LocalDate ngayXuatDon, int maNV){
        this.id = id;
        this.ngayXuatDon = ngayXuatDon;
        this.maNV = maNV;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public LocalDate getNgayXuatDon(){
        return ngayXuatDon;
    }
    public void setNgayXuatDon(LocalDate ngayXuatDon){
        this.ngayXuatDon = ngayXuatDon;
    }
    public int getMaNV(){
        return maNV;
    }
    public void setMaNV(int maNV){
        this.maNV = maNV;
    }
    public int getMaKH(){
        return maKH;
    }
    public void setMaKH(int maKH){
        this.maKH = maKH;
    }
}
