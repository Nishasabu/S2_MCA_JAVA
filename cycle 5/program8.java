import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class P8KeyEvent extends Applet implements KeyListener {
   
    String msg="";
    char ms;
    public void init()
    {
       addKeyListener(this);
       requestFocus();
    }
   
  public void paint(Graphics g)
    {
        g.drawString(msg,100,50);
    }
 
   public void keyTyped(KeyEvent ke)
    {
       
       msg="Key Typed";
        repaint();
    }
   
    public void keyReleased(KeyEvent ke)
    {
        msg="Key Released";
        repaint();
    }
    public void keyPressed(KeyEvent ke)
    {
        int k=ke.getKeyCode();
        switch(k)
        {
            case KeyEvent.VK_F1:msg="F1";
                break;
            case KeyEvent.VK_F2:msg="F2";
                break;
            case KeyEvent.VK_F3:msg="F3";
                break;
            case KeyEvent.VK_PAGE_UP:msg="Pageup";
                break;
            case KeyEvent.VK_PAGE_DOWN:msg="Pagedown";
                break;
            case KeyEvent.VK_LEFT:msg="Left arrow";
                break;
            case KeyEvent.VK_RIGHT:msg="Right arrow";
                break;
        }
        repaint();
    }
}