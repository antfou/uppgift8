package övningsuppgifter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class uppgift7 extends JFrame implements MouseListener {

    JPanel panel = new JPanel();
    JButton button = new JButton();
    JLabel label = new JLabel();

    public void program(){
        add(panel);
        panel.add(label);
        label.setVisible(false);
        panel.add(button);
        button.setText("Nu är den vit");
        button.addMouseListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("RGB Color Clicker");
        setLocationRelativeTo(null);
        setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        button.setBackground(Color.RED);
        button.setText("RÖD!");
        label.setText("Nu är den");
        label.setVisible(true);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main (String[] args){
        uppgift7 u = new uppgift7();
        u.program();
    }

}
