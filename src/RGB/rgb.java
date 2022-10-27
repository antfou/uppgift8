package RGB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rgb extends JFrame implements ActionListener{
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();
    JPanel jp4 = new JPanel();
    JCheckBox red = new JCheckBox();
    JCheckBox green = new JCheckBox();
    JCheckBox blue = new JCheckBox();
    JLabel label = new JLabel();

    public void GUI(){
        jp.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        jp.setLayout(new GridLayout(0,1));
        label.setText("Klicka i en låda för att lägga till den färgen:");
        blue.setText("Blå");
        red.setText("Röd");
        green.setText("Grön");
        blue.addActionListener(this);
        green.addActionListener(this);
        red.addActionListener(this);
        jp.add(label);
        jp.add(green);
        jp.add(blue);
        jp.add(red);

        jf.add(jp, BorderLayout.CENTER);
        jf.add(jp1, BorderLayout.SOUTH);
        jf.add(jp2, BorderLayout.EAST);
        jf.add(jp3, BorderLayout.WEST);
        jf.add(jp4, BorderLayout.NORTH);

        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setTitle("RGB Color Clicker");
        jf.setLocationRelativeTo(null);
        jf.pack();
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (green.isSelected()&& !(red.isSelected()) && !(blue.isSelected()))
        {
            label.setText("Nu är det grönt:");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(0, 255, 0));
            jp2.setBackground(new Color(0, 255, 0));
            jp3.setBackground(new Color(0, 255, 0));
            jp4.setBackground(new Color(0, 255, 0));
        }
        if (!green.isSelected() && (red.isSelected()) && !(blue.isSelected()))
        {
            label.setText("Nu är det rött:");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(255, 0, 0));
            jp2.setBackground(new Color(255, 0, 0));
            jp3.setBackground(new Color(255, 0, 0));
            jp4.setBackground(new Color(255, 0, 0));
        }
        if (!green.isSelected() && (!red.isSelected()) && (blue.isSelected()))
        {
            label.setText("Nu är det  blått:");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(0, 0, 255));
            jp2.setBackground(new Color(0, 0, 255));
            jp3.setBackground(new Color(0, 0, 255));
            jp4.setBackground(new Color(0, 0, 255));
        }
        if (!green.isSelected() && (red.isSelected()) && (blue.isSelected()))
        {
            label.setText("Nu är det lila:");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(255, 0, 255));
            jp2.setBackground(new Color(255, 0, 255));
            jp3.setBackground(new Color(255, 0, 255));
            jp4.setBackground(new Color(255, 0, 255));
        }
        if (green.isSelected() && (red.isSelected()) && !(blue.isSelected()))
        {
            label.setText("Nu är det gult:");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(255, 255, 0));
            jp2.setBackground(new Color(255, 255, 0));
            jp3.setBackground(new Color(255, 255, 0));
            jp4.setBackground(new Color(255, 255, 0));
        }
        if (green.isSelected() && !(red.isSelected()) && (blue.isSelected()))
        {
            label.setText("Nu är det cyan:");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(0, 255, 255));
            jp2.setBackground(new Color(0, 255, 255));
            jp3.setBackground(new Color(0, 255, 255));
            jp4.setBackground(new Color(0, 255, 255));
        }
        if (green.isSelected() && (red.isSelected()) && (blue.isSelected()))
        {
            label.setText("Såhär blir det när du maxar alla färger:");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(255, 255, 255));
            jp2.setBackground(new Color(255, 255, 255));
            jp3.setBackground(new Color(255, 255, 255));
            jp4.setBackground(new Color(255, 255, 255));
        }
        if (!green.isSelected() && (!red.isSelected()) && !(blue.isSelected()))
        {
            label.setText("Nu tog du bort alla färger:");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(0, 0, 0));
            jp2.setBackground(new Color(0, 0, 0));
            jp3.setBackground(new Color(0, 0, 0));
            jp4.setBackground(new Color(0, 0, 0));
        }

    }



    public static void main (String[] args) {
        rgb m = new rgb();
        m.GUI();
    }

}