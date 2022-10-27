package Övningsuppgift4;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class övningsuppgift4 extends JFrame {

    JPanel panel = new JPanel();
    JLabel label = new JLabel("Filnamn:");
    JTextField textField = new JTextField();
    JButton open = new JButton("Öppna");
    JButton save = new JButton("Spara");
    JButton print = new JButton("Skriv ut");
    JButton end = new JButton("Avsluta");
    JTextArea textArea = new JTextArea(10,60);
    JScrollPane scrollPane   = new JScrollPane(textArea,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    public övningsuppgift4(){
        setTitle("Coola fil läsaren");
        textArea.setFont(new Font("FontName", Font.ROMAN_BASELINE, 15));
        panel.setLayout(new GridLayout(1,6));
        panel.add(label);
        panel.add(textField);
        panel.add(open);
        panel.add(save);
        panel.add(print);
        panel.add(end);
        save.addActionListener(l->{saveFile(textField.getText());});
        open.addActionListener(l->{readFile(textField.getText());});
        print.addActionListener(l->{
            try {
                textArea.print();
            } catch (PrinterException e) {
                throw new RuntimeException(e);
            }
        });
        end.addActionListener(l->{System.exit(0);});

        add(panel,  BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void readFile(String fileName){
        try {
            FileReader r = new FileReader(fileName);{
            textArea.read(r, null);}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void saveFile(String fileName){
        try {
            FileWriter f = new FileWriter(fileName);
            textArea.write(f);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args){
        new övningsuppgift4();

    }

}
