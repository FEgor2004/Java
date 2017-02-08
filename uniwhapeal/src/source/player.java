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
    boolean isLeft;
    
    public player(int fighterID, boolean left) {
        loadFighterImg(fighterID);
        if(left) {
            x=0; 
            y=0;
        }
        else {
            x=700;
            y=0;
        }
        isLeft = left;
    }
    
    public void loadFighterImg(int fighterId) {
            if(isLeft) {
                if(fighterId == 1) {
                    try {
                        fighterImg = ImageIO.read(new File("./src/source/img/unicorn1.png"));
                    } catch(IOException ioexp) {}
                }
                if(fighterId == 2) {
                    try {
                        fighterImg = ImageIO.read(new File("./src/source/img/ufo.png"));
                    } catch(IOException ioexp) {}
                }
                if(fighterId == 3) {
                    try {
                        fighterImg = ImageIO.read(new File("./src/source/img/penguin.png"));
                    } catch(IOException ioexp) {}
                }
                if(fighterId == 4) {
                    try {
                        fighterImg = ImageIO.read(new File("./src/source/img/whape.png"));
                    } catch(IOException ioexp){}
                }
            }
            if(!isLeft) {
                                if(fighterId == 1) {
                    try {
                        fighterImg = ImageIO.read(new File("./src/source/img/unicorn1.png"));
                    } catch(IOException ioexp) {}
                }
                if(fighterId == 2) {
                    try {
                        fighterImg = ImageIO.read(new File("./src/source/img/ufo1.png"));
                    } catch(IOException ioexp) {}
                }
                if(fighterId == 3) {
                    try {
                        fighterImg = ImageIO.read(new File("./src/source/img/penguin1.png"));
                    } catch(IOException ioexp) {}
                }
                if(fighterId == 4) {
                    try {
                        fighterImg = ImageIO.read(new File("./src/source/img/whape1.png"));
                    } catch(IOException ioexp){}
            }
    }
    }
    public void drawPlayer(Graphics gr) {
        gr.drawImage(fighterImg, x, y, null);
    }
    
}
