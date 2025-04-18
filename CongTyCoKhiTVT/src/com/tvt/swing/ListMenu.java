/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvt.swing;

import com.tvt.entity.Model_Menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS
 */
public class ListMenu<E extends Object> extends  JList<E>{
    
    private final DefaultListModel model ;
    private int selectedIndex = -1;
    public ListMenu(){
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if(o instanceof Model_Menu){
                        Model_Menu menu = (Model_Menu) o;
                        if(menu.getType() == Model_Menu.MenuType.MENU){
                            selectedIndex = index;
                        }
                    }else{
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
        });
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                Model_Menu data;
                if(o instanceof Model_Menu){
                    data = (Model_Menu)o;
                }else{
                    data = new Model_Menu(o+"",Model_Menu.MenuType.EMPTY);
                }
                Menu_Item item = new Menu_Item(data);
                item.setSelected(selectedIndex == index);
                return item;
            }
        };
    }
    
    public void addItem(Model_Menu data){
        model.addElement(data);
    }
}
