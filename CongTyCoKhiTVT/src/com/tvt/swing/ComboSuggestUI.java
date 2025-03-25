/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvt.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ASUS
 */
public class ComboSuggestUI extends BasicComboBoxUI{

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        Border border = new Border();
        AutoCompleteDecorator.decorate(comboBox);
        comboBox.setBackground(Color.WHITE);
        comboBox.setBorder(border);
    }
    
    private class Border extends EmptyBorder{
         
        private Color focusColor = new Color(128, 189, 255);
        private Color color = new Color(206, 212, 218);
        
        public Border(int border){
            super(border, border, border, border);
        }
        
        public Border(){
            this(5);
        }

        @Override
        public void paintBorder(Component c, Graphics grphcs, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (c.isFocusOwner()) {
                g2.setColor(focusColor);
            } else {
                g2.setColor(color);
            }
            g2.drawRect(x, y, width - 1, height - 1);
            g2.dispose();
        }
    }
}
