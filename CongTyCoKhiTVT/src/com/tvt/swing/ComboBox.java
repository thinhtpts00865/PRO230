package com.tvt.swing;

import javax.swing.JComboBox;

public class ComboBox<E> extends JComboBox<E>{
    public ComboBox(){
        setUI(new ComboSuggestUI());
    }
}
