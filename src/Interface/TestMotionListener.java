package Interface;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class TestMotionListener extends JFrame implements MouseMotionListener {

    public TestMotionListener(){
        setTitle("Teste Motion");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Escrito");
        add(jLabel);
        addMouseMotionListener(this);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new TestMotionListener();
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        System.out.println("Arrastou: " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        System.out.println("Moveu: " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }
}
