/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author egor
 */
public class field extends javax.swing.JPanel {
    
    //Mouse listener
    
    public class myMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            int button = e.getButton();
            int pX = e.getX();
            int pY = e.getY();
            
            if(button==1) {
                if(pY < 50) {
                    changedCol = colors[pX/100];
                }
            }
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            mouseDragged=false;
        }

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }
    
    public class myMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
            int tX = e.getX();
            int tY = e.getY();
                   if(tY>50) {
                       mY = tY;
                       mX = tX;
                       mouseDragged = true;
                       repaint();
                   
               }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            tX = e.getX();
            tY = e.getY();
            System.out.print("Move");
            			if ((tX > 0) && (tX < 700) && (tY > 0) && (tY < 50)) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			} else {
				setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			}
         }
        
    }
    
    //Переменныеы
    
    Color[] colors = new Color[8];
    
    Color changedCol;
    
    int tY;
    int tX;
    
    int mY;
    int mX;
    
    boolean mouseDragged = false;
    
    public field() {
        addMouseListener(new myMouseListener());
        addMouseMotionListener(new myMouseMotionListener());
        colors[0] = Color.BLACK;
        colors[1] = Color.WHITE;
        colors[2] = Color.YELLOW;
        colors[3] = Color.GREEN;
        colors[4] = Color.ORANGE;
        colors[5] = Color.BLUE;
        colors[6] = Color.RED;
        colors[7] = Color.MAGENTA;
        }
    
    public void paintComponent(Graphics gr) {
                if(mouseDragged && mY>50) {
            gr.setColor(changedCol);
            gr.fillOval(mX, mY, 10, 10);
        }
        for(int i = 0; i<=7; i++) {
            gr.setColor(colors[i]);
            gr.fillRect(100*i, 0, 100, 50);
        }

    }
    
}
