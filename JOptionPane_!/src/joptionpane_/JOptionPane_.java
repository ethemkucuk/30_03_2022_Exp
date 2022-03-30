/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane_;

import javax.swing.JOptionPane;

/**
 *
 * @author Monster
 */
public class JOptionPane_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String strWord = JOptionPane.showInputDialog("String girin", "impROS");
    int lengthStr = strWord.length();

    JOptionPane.showMessageDialog(null, strWord + " Uzunlugu : " + lengthStr, "Kelime Uzunlugu ", JOptionPane.INFORMATION_MESSAGE);
}

        
        // TODO code application logic here
    }
    

