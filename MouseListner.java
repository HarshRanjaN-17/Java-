import java.awt.*;
import java.awt.event.*;

public class MouseListner extends Frame implements MouseMotionListener {
    MouseListner() {
        addMouseMotionListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public void mouseMoved(MouseEvent e) {
    }

    public static void main(String[] args) {
        new MouseListner();
    }
}