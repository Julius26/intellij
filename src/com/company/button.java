package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

/**
 * Created by emobilis on 6/23/17.
 */
public class button {
    public static void main(String[]args){
        JFrame f=new JFrame("MY OVERALL CONTAINER");//setting frame
        f.setSize(300,300);//setting width of the frame

        JPanel p= new JPanel();

        JLabel label=new JLabel("enter name");
        label.setBounds(new Rectangle (0,0,50,50));
        JTextField textField=new JTextField(" ");
        textField.setColumns(8);//set width of text field
        textField.setBounds(0,0,50,100);
        JButton b=new JButton("click me");

        FlowLayout L=new FlowLayout();//to layout
        p.setBackground(Color.blue);
        p.setLayout(L);

        p.add(label);//add buton to panel
        p.add(textField);
        p.add(b);

        f.setContentPane(p);
        f.show();
        b.addActionListener(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.red);
            }
            }  );


    }
}




