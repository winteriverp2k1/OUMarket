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
public class ChiTietHoaDon {
    private int maHangHoa;
    private int maHoaDon;
    private float soLuong;
    private int donGia;
    
    public ChiTietHoaDon(){
        
    }
    public ChiTietHoaDon(int maHangHoa, int maHoaDon, float soLuong, int donGia){
        this.maHangHoa = maHangHoa;
        this.maHoaDon = maHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public int getMaHangHoa(){
        return maHangHoa;
    }
    public void setMaHangHoa(int id){
        this.maHangHoa = id;
    }
    public int getMaHoaDon(){
        return maHoaDon;
    }
    public void setMaHoaDon(int id){
        this.maHoaDon = id;
    }
    public float getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(float soLuong){
        this.soLuong = soLuong;
    }
    public int getDonGia(){
        return donGia;
    }
    public void setDonGia(int donGia){
        this.donGia = donGia;
    }
}
