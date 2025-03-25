/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvt.dao;

import com.tvt.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ThongKeDAO {
    private  List<Object[]> getListOfArray(String sql ,String[] cols, Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                   vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
     public  List<Object[]> getTopSanPham(Integer makh){
        String sql = "EXEC Top10SanPhamBanChay";
        String[] cols = {"hinhAnh","tenSP","tongSoLuongBan"};
        return this.getListOfArray(sql, cols);
    }
     
     public  List<Object[]> getTrangThaiDonHang(){
        String sql = "EXEC DonHangTrangThai";
        String[] cols = {"ChuaThanhToan","ChuaGiao","DaGiao","HuyDon"};
        return this.getListOfArray(sql, cols);
    }
     
     public  List<Object[]> getDoanhThuTheoNam(int year){
        String sql = "SELECT * FROM fn_ThongKeDoanhThuTheoNam(?)";
        String[] cols = {"Thang","TongDoanhThu"};
        return this.getListOfArray(sql, cols,year);
    }
     
     public  List<Object[]> getThongTinTheoNam(int year){
        String sql = "EXEC ThongKeThongTinNam ?";
        String[] cols = {"Nam","TongDonHang","TongSoLuongHang","TongDoanhThu"};
        return this.getListOfArray(sql, cols,year);
    }
}
