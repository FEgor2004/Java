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
    
    private Image bg;

    public player firstPlayer;
    public player secondPlayer;
    
    public gamePanel(int firstPlayerFighterId, int secondPlayerFighterId) throws IOException {
        try {
            bg = ImageIO.read(new File("./src/source/img/bg.jpg"));
        }
        catch(IOException ioexp) {
        System.out.println(ioexp);
        }
        firstPlayer = new player(firstPlayerFighterId, true);
        secondPlayer = new player(secondPlayerFighterId, false);
    }
    public void paintComponent(Graphics gr) {
        gr.drawString("ЭТО ГОВНО ДОЛЖНО РАБОТАТЬ", 100, 100);
        gr.drawImage(bg, -400, -400, this);
       firstPlayer.drawPlayer(gr);
       secondPlayer.drawPlayer(gr);
    }
}
