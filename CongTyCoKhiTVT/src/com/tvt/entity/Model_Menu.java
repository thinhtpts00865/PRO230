/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvt.entity;



/**
 *
 * @author ASUS
 */
public class Model_Menu {
    String name;
    MenuType type;
    
    public static enum MenuType {
        TITLE,MENU,EMPTY 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Model_Menu(String name, MenuType type) {
        this.name = name;
        this.type = type;
    }

    public Model_Menu() {
    }
}
