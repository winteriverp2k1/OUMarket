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
public class KhuyenMai {
    private int id;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private int giaKhuyenMai;
    
    public KhuyenMai(){
        
    }
    public KhuyenMai(int id, LocalDate ngayBatDau, LocalDate ngayKetThuc,
            int giaKhuyenMai){
        this.id = id;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giaKhuyenMai = giaKhuyenMai;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public LocalDate getNgayBatDau(){
        return ngayBatDau;
    }
    public void setNgayBatDau(LocalDate ngayBatDau){
        this.ngayBatDau = ngayBatDau;
    }
    public LocalDate getNgayKetThuc(){
        return ngayKetThuc;
    }
    public void setNgayKetThuc(LocalDate ngayKetThuc){
        this.ngayKetThuc = ngayKetThuc;
    }
    public int getGiaKhuyenMai(){
        return giaKhuyenMai;
    }
    public void setGiaKhuyenMai(int giaKhuyenMai){
        this.giaKhuyenMai = giaKhuyenMai;
    }
}
