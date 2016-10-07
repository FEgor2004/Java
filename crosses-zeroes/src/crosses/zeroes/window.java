/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crosses.zeroes;

import java.awt.Container;

/**
 *
 * @author egor
 */
public class window extends javax.swing.JFrame {
    
    field field;
    
    public window() {
        setBounds(100, 100, 600, 600);
        setTitle("Квадратики-нолики");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        Container cont = getContentPane();
        field = new field();
        cont.add(field);
        
    }
}
