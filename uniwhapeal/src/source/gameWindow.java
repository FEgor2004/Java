/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.awt.Container;


/**
 *
 * @author egor
 */
public class gameWindow extends javax.swing.JFrame {
    gamePanel myPanel;
    public gameWindow(int firstPlayerId, int secondPlayerId) {
            setBounds(0, 0, 800, 600);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            myPanel = new gamePanel();
            Container cont = getContentPane();
            cont.add(myPanel);
    }
}
