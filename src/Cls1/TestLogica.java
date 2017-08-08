/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cls1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TestLogica {

    public static void main(String[] args) {

        String nombre;

        int precio, cantidad, mayor = 0, mayor2 = 0;

        for (int i = 1; i <= 3; i++) {
            nombre = JOptionPane.showInputDialog(null, "Digite Nombre: ");
            precio = Integer.parseInt(JOptionPane.showInputDialog("Digite Precio: "));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite Cantidad: "));
            mayor2 = cantidad;
            mayor = validarMayor(cantidad);

            if (mayor >= mayor2) {
                JOptionPane.showMessageDialog(null, "Nombre\t: " + nombre + " " + "Precio\t: " + precio + " " + "Cantidad\t: " + cantidad);
            }

        }

    }

    public static int validarMayor(int cant) {
        int mayorCant = 0;

        if (cant > mayorCant) {
            mayorCant = cant;

        }

        return mayorCant;
    }

}
