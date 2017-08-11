/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cls1;

import javax.swing.JOptionPane;//Instruccion Que Nos importa la liberia o (clase) a utilizar el metodo JOptionPane

/**
 *
 * @author Daniel P.Calle
 * @version 04-08-2017/1.0
 */

public class TestLogica {

    //Atributos Privados 
    private static String nombre;//Declaramos el atributo nombre como string
    private static int precio, cantidad;//Declaramos el atributo precio, cantidad como Numerico(Entero): Int

    //Metodo Principal    
    public static void main(String[] args) {
        int mayor = 0, vrPrecio = 0;//Declaramos y inicializamos las variables locales mayor, vrPrecio en cero
        String nom = "";//declaramos La variable local nombre como string(Caracter) secuencia de expresioens alfanumericas
        
        //Ciclo for 
        for (int i = 1; i <= 3; i++) {
            nombre = JOptionPane.showInputDialog(null, "Digite Nombre: ");
            precio = Integer.parseInt(JOptionPane.showInputDialog("Digite Precio: "));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite Cantidad: "));

            //Condicional Siempre que valida la mayor cantidad en los registro
            if (cantidad > mayor) {
                mayor = cantidad;//A mayor le asignamos el valor cantidad actual
                nom = nombre;//a nom le llevamos el nombre del producto
                vrPrecio = precio;//a vrPrecio le llevamos el precio actual del producto

            }

        }
        //Instruccion Que Nos imprime Solo El registro cuya cantidad validada sea mayor. Uitlizamos JOptionPane de clase swing
        JOptionPane.showMessageDialog(null, "Nombre\t: " + nom + " " + " Cantidad\t: " + mayor + " " + " Precio\t: " + vrPrecio);

    }
}
