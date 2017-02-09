/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


/**
 *
 * @author egor
 */
public class gameWindow extends javax.swing.JFrame {
    gamePanel myPanel;
    
    private class UpDownKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {}

        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if(keyCode==40) {
                if(myPanel.secondPlayer.y<400) {
                myPanel.secondPlayer.y = myPanel.secondPlayer.y+5;
                }
            }
            if(keyCode==38) {
                if(myPanel.secondPlayer.y>0) {
                    myPanel.secondPlayer.y = myPanel.secondPlayer.y-5;
                }
            }

            
            
            if(keyCode==83) {
                if(myPanel.firstPlayer.y<400) {
                myPanel.firstPlayer.y = myPanel.firstPlayer.y+5;
                }
            }
            if(keyCode==87) {
                if(myPanel.firstPlayer.y>0) {
                    myPanel.firstPlayer.y = myPanel.firstPlayer.y-5;
                }
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {}
        
    }
    
    private class LeftRightKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if(keyCode==65) {
                if(myPanel.firstPlayer.x>0) {
                    myPanel.firstPlayer.x = myPanel.firstPlayer.x-5;
                }
            }
            if(keyCode==68) {
                if(myPanel.firstPlayer.x<400) {
                    myPanel.firstPlayer.x= myPanel.firstPlayer.x+5;
                }
            }
            if(keyCode==37) {
                if(myPanel.secondPlayer.x>500) {
                    myPanel.secondPlayer.x = myPanel.secondPlayer.x-5;
                }
            }
            if(keyCode==39) {
                if(myPanel.secondPlayer.x<700) {
                    myPanel.secondPlayer.x= myPanel.secondPlayer.x+5;
                }
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if(keyCode==65) {
                if(myPanel.firstPlayer.x>0) {
                    myPanel.firstPlayer.x = myPanel.firstPlayer.x-5;
                }
            }
            if(keyCode==68) {
                if(myPanel.firstPlayer.x<400) {
                    myPanel.firstPlayer.x= myPanel.firstPlayer.x+5;
                }
            }
            if(keyCode==37) {
                if(myPanel.secondPlayer.x>500) {
                    myPanel.secondPlayer.x = myPanel.secondPlayer.x-5;
                }
            }
            if(keyCode==39) {
                if(myPanel.secondPlayer.x<700) {
                    myPanel.secondPlayer.x= myPanel.secondPlayer.x+5;
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if(keyCode==65) {
                if(myPanel.firstPlayer.x>0) {
                    myPanel.firstPlayer.x = myPanel.firstPlayer.x-5;
                }
            }
            if(keyCode==68) {
                if(myPanel.firstPlayer.x<400) {
                    myPanel.firstPlayer.x= myPanel.firstPlayer.x+5;
                }
            }
            if(keyCode==37) {
                if(myPanel.secondPlayer.x>500) {
                    myPanel.secondPlayer.x = myPanel.secondPlayer.x-5;
                }
            }
            if(keyCode==39) {
                if(myPanel.secondPlayer.x<700) {
                    myPanel.secondPlayer.x= myPanel.secondPlayer.x+5;
                }
            }
        }
        
    }
    
    public gameWindow(int firstPlayerId, int secondPlayerId) throws IOException {
            this.addKeyListener(new LeftRightKeyListener());
            this.addKeyListener(new UpDownKeyListener());
            setBounds(0, 0, 1000, 600);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            myPanel = new gamePanel(firstPlayerId, secondPlayerId);
            Container cont = getContentPane();
            cont.add(myPanel);
    }
    

    
}
