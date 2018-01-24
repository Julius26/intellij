import javax.swing.*;

/**
 * Created by User on 6/22/2017.
 */
public class marks1 {
    public static void main(String[]args){
        String []marks;
        marks= new String[5];

        int[] converted;
        converted=new  int[5];
        int sum=0;
        for (int i=0;i<=4;i++){
            marks[i]= JOptionPane.showInputDialog("enter marks"+i);
            converted[i]=Integer.parseInt(marks[i]);
            sum=sum+converted[i];
        }
        JOptionPane.showInputDialog("The sum is"+sum);
    }
}
