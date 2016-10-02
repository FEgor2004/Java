/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint;
import java.awt.Container;
import java.awt.event.*;
/**
 *
 * @author egor
 */
public class window extends javax.swing.JFrame {
    
    field field;
    
    public window() {
        
        
        //Create window
        
        setBounds(100, 100, 800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mini-paint");
        setVisible(true);
        
        //Adding field
        field = new field();
        Container cont = getContentPane();
        cont.add(field);
    }
}
