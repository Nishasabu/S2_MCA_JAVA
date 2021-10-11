import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class homecoloring extends Applet implements MouseListener {
Color color = Color.blue;
public void init()
{
    addMouseListener(this);
}
   public void paint(Graphics g)
{

int [] xCoords = { 40, 250, 460 };
int [] yCoords = { 200, 50, 200 };

super.paint(g);

g.drawRect(80, 200, 330, 260);
g.drawPolygon(xCoords , yCoords , 3);


g.setColor(this.color);
g.fillRect(190, 330, 100, 130);
}
   public void mouseClicked(MouseEvent e)
{
    this.color = color.red;
    this.repaint();

}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
}
//addMouseListener(new MouseEventListener());
