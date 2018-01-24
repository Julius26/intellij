import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 6/26/2017.
 */
public class calc2 {
    public static void main(String[]args){
        JFrame f=new JFrame();
        FlowLayout layout=new FlowLayout();
        f.setLayout(layout);
        f.setSize(150,150);



        JPanel p=new JPanel();
        JLabel one =new JLabel("enter first number");
        JTextField tone=new JTextField();
        tone.setColumns(15);

        JLabel two=new JLabel("enter second number");
        JTextField ttwo=new JTextField();
        ttwo.setColumns(15);

        JButton add=new JButton("+");
        p.add(one);
        p.add(two);
        p.add(tone);
        p.add(ttwo);
        p.add(add);
        f.setContentPane(p);
        f.show();
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numberone=tone.getText().toString(); //getting text from a text field
                int covno=Integer.parseInt(numberone);

                String numbertwo=ttwo.getText().toString();
                int convo2=Integer.parseInt(numbertwo);
                int ans=covno+convo2;
                JOptionPane.showMessageDialog(null,"The anser is"+ans);
            }
        });


    }
}
