package com.company;

import javax.swing.*;

/**
 * Created by User on 6/22/2017.
 */
public class arraysb {
    public static void main(String[]args){

        String[]supermarkets={"Nakumatt","magunas","jack & jill","Naivas","Carrefour","Ukwala","Satelite","karymart"};

        for (int i=0;i<=8;i++){

            System.out.println(supermarkets[i]);
           JOptionPane.showMessageDialog(null ,"The Supermarket is" +supermarkets[i]);
        }
    }
}
