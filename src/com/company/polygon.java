import javax.swing.*;

/**
 * Created by User on 6/22/2017.
 */
public class polygon {
    public void triangle(){
        String bas=JOptionPane.showInputDialog("enter base");
        String hei=JOptionPane.showInputDialog("enter height");

        int base=Integer.parseInt(bas);
        int height=Integer.parseInt(hei);

        double area=0.5*base*height;
        JOptionPane.showMessageDialog(null,"The area of a triangle is"+area);
    }

    public void rectange(){
     String len =JOptionPane.showInputDialog("enter length");
     String wid= JOptionPane.showInputDialog("enter width");

     int length=Integer.parseInt(len);
     int width=Integer.parseInt(wid);

     double arear=length*width;
     JOptionPane.showMessageDialog(null,"the area of a rectangle is"+arear);

    }
}
