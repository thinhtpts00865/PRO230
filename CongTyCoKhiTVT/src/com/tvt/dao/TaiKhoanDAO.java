/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvt.dao;

import com.tvt.entity.TaiKhoan;
import com.tvt.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TaiKhoanDAO extends EduSysDAO<TaiKhoan, String>{
    public void insert(TaiKhoan model){
        String sql="INSERT INTO TaiKhoan (maNV, password, username, vaiTro) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getMaNV(), 
                model.getMatKhau(), 
                model.getUsername(), 
                model.isVaiTro());
    }
    
    public void update(TaiKhoan model){
        String sql="UPDATE TaiKhoan SET password=?, username=?, vaiTro=? WHERE maNV=?";
        XJdbc.update(sql, 
                model.getMatKhau(), 
                model.getUsername(), 
                model.isVaiTro(),
                model.getMaNV());
    }
    
    public void delete(String MaNV){
        String sql="DELETE FROM TaiKhoan WHERE maNV=?";
        XJdbc.update(sql, MaNV);
    }
    
    public List<TaiKhoan> selectAll(){
        String sql="SELECT * FROM TaiKhoan";
        return this.selectBySql(sql);
    }
    
    public TaiKhoan selectById(String tenDN){
        String sql="SELECT * FROM TaiKhoan WHERE username=?";
        List<TaiKhoan> list = this.selectBySql(sql, tenDN);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        ResultSet rs = null; 
        try {
            rs = XJdbc.query(sql, args);
            while (rs.next()) {
                TaiKhoan entity = new TaiKhoan();
                entity.setMaNV(rs.getString("maNV"));
                entity.setMatKhau(rs.getString("password"));
                entity.setUsername(rs.getString("username"));
                entity.setVaiTro(rs.getBoolean("vaiTro"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            if (rs != null) { 
                try {
                    rs.getStatement().getConnection().close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
}
}
