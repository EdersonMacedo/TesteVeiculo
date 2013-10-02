/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author guest01
 */
public class Baiano {

    public static void main(String[] args) {
        int soma = 1;


        while (soma > 0) {
            if (soma == 1) {
                JOptionPane.showMessageDialog(null, "" + soma + " - BAIANO INCOMODA MUITA GENTE");
                JOptionPane.showMessageDialog(null, "" + (soma + 1) + " - BAIANOS INCOMODA INCOMODA MUITO MAIS");
                soma++;
            } else if (soma > 1) {
                JOptionPane.showMessageDialog(null, "" + soma + " - BAIANOS INCOMODA MUITA GENTE");
                JOptionPane.showMessageDialog(null, "" + (soma + 1) + " - BAIANOS INCOMODA INCOMODA MUITO MAIS");
                soma++;
            }
        }
    }
}