/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author egor
 */
public class gamePanel extends javax.swing.JPanel {
    
    Image bg;
    
    public gamePanel() {
        try {
            bg = ImageIO.read(new File("./src/source/img/bg.jpg"));
        }
        catch(IOException ioexp) {
        System.out.println(ioexp);
        }
    }
    public void paintComponent(Graphics gr) {
        gr.drawString("ЭТО ГОВНО ДОЛЖНО РАБОТАТЬ", 100, 100);
        gr.drawImage(bg, 0, 0, this);
    }
}
