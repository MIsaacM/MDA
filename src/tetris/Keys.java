package tetris;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener{

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case 37: // <-
                movements(position, LEFT, stage);
                break;
            case 38: // ->
                movements(position, RIGHT, stage);
                break;
            case 39: // ^
                movements(position, FALL, stage);
                break;
            case 40: // v
                movements(position, DOWN, stage);
                break;
            case 82: // r R
                movements(position, ROTATE, stage);
                break;
            
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
