import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyWindow extends JFrame implements MouseListener {
    public MyWindow(){
        super();
        addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("*click*");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("release");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("good.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("welcome.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("goodbye");
    }

    public static void main(String[] args) {
        MyWindow mw = new MyWindow();

    }
}
