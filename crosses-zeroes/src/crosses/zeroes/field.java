/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crosses.zeroes;

import java.awt.Graphics;

/**
 *
 * @author egor
 */
public class field extends javax.swing.JPanel {
    
    int firstLine[] = new int[3];
    int secondLine[] = new int[3];
    int thirdLine[] = new int[3];
    
    public field() {
        for(int i = 0; i<=3; i++) {
            firstLine[i] = 0;
            secondLine[i] = 0;
            thirdLine[i] = 0;
        }
    }
    
    public void paintComponent(Graphics gr) {
        for(int i = 3; i<4; i++) {
            for(int u = 3; u<4; u++) {
                gr.drawRect(u, i, 100, 100);
            }
        }
    }
    
    public void drawLines(Graphics gr) {
            for(int i = 0; i<4; i++) {
                if(firstLine[i] == 0) {}
                if(firstLine[i] == 1) gr.drawOval(i, 0, WIDTH, HEIGHT);
            }
    }
    
}
