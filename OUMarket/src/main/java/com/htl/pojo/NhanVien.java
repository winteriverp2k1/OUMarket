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
public class NhanVien {
    private int id;
    private String ho;
    private String ten;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private String sdt;
    private int maChiNhanh;
    private int tienLuong;
    private String chucVu;
    private int maTK;
    
    public NhanVien(){
        
    }
    public NhanVien(int id, String ho, String ten, LocalDate ngayBatDau, 
            String sdt, int maChiNhanh, int tienLuong, 
            String chucVu, int maTK){
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.ngayBatDau = ngayBatDau;
        this.sdt = sdt;
        this.maChiNhanh = maChiNhanh;
        this.tienLuong = tienLuong;
        this.chucVu = chucVu;
        this.maTK = maTK;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getHo(){
        return ho;
    }
    public void setHo(String ho){
        this.ho = ho;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
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
    public String getsdt(){
        return sdt;
    }
    public void setSdt(String sdt){
        this.sdt = sdt;
    }
    public int getMaChiNhanh(){
        return maChiNhanh;
    }
    public void setMaChiNhanh(int maChiNhanh){
        this.maChiNhanh = maChiNhanh;
    }
    public int getTienLuong(){
        return tienLuong;
    }
    public void setTienLuong(int tienLuong){
        this.tienLuong = tienLuong;
    }
    public String getChucVu(){
        return chucVu;
    }
    public void setChucVu(String chucVu){
        this.chucVu = chucVu;
    }
    public int getMaTK(){
        return maTK;
    }
    public void setMaTK(int maTK){
        this.maTK = maTK;
    }
}
