/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cls2;

import javax.swing.JOptionPane;

/**
 *
 * @author salak403
 */
public class Practica2 {

    int[] vec=new int[10];
    
    public static void main(String[] args) {
        Practica2 obj = new Practica2();
        obj.ingresar();

    }
    
    private  void ingresar()
    {
        
                                                                    
        for (int i = 1; i <= 10; i++) {
            vec[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite codigo \t: "));
        }
    }
}
