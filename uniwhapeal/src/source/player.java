/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author egor
 */
public class player {
    
    Image fighterImg;
    public int x;
    public int y;
    boolean isleft;
    
    public player(int fighterID, boolean left) throws IOException {
        loadFighterImg(fighterID);
        if(left) {
            x=0; 
            y=0;
        }
        else {
            x=400;
            y=0;
        }
        isleft = left;
    }
    
    public void loadFighterImg(int fighterId) throws IOException {
        if(fighterId == 1 && isleft) fighterImg = ImageIO.read(new File("./src/source/img/unicorn.png"));
        if(fighterId == 1 && !isleft) fighterImg = ImageIO.read(new File("./src/source/img/unicorn1.png"));
        if(fighterId == 2 && isleft) fighterImg = ImageIO.read(new File("./src/source/img/ufo.png"));
        if(fighterId == 2 && !isleft) fighterImg = ImageIO.read(new File("./src/source/img/ufo1.png"));
        if(fighterId == 3 && isleft) fighterImg = ImageIO.read(new File("./src/source/img/penguin.png"));
        if(fighterId == 3 && !isleft) fighterImg = ImageIO.read(new File("./src/source/img/penguin1.png"));
        if(fighterId == 4 && isleft) fighterImg = ImageIO.read(new File("./src/source/img/whale.png"));
        if(fighterId == 4 && !isleft) fighterImg = ImageIO.read(new File("./src/source/img/whale1.png"));
    }
    public void drawPlayer(Graphics gr) {
        gr.drawImage(fighterImg, x, y, null);
    }
    
}
