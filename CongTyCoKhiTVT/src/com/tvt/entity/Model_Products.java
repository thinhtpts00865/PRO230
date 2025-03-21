/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvt.entity;

import javax.swing.Icon;

/**
 *
 * @author ASUS
 */
public class Model_Products {
    private Icon icon;
    private int sale;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public Model_Products(Icon icon, int sale) {
        this.icon = icon;
        this.sale = sale;
    }

    public Model_Products() {
    }
    
    public Object[] toDataTable(){
        return new Object[]{icon, sale};
    }
}
