package com.company;

import javax.swing.*;

/**
 * Created by User on 6/21/2017.
 */
public class arrays3 {
    public static void main(String[]args){
        int k=1;
        int w=0;
        String[]numbers;
        numbers=new String[5];
        while (k<=5){
           numbers[w]= JOptionPane.showInputDialog("type number" +k);
            k++;
            w++;
        }
        int j=0;
        while (j<=4){
            System.out.println(numbers[j]);
            j++;
        }
    }
}
