/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cls2;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author salak403
 */
public class Practica2 {

    int[] vec = new int[10];

    public static void main(String[] args) {
        Practica2 obj = new Practica2();
        obj.ingresar();
        obj.imprimir();
        ///JOptionPane.showMessageDialog(null, obj.buscarMayor());
        obj.imprimir2(obj.buscarMayor());//instancio el objecto alcargar 
    }

    private void ingresar() {

        for (int i = 0; i < 10; i++) {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo \t: "));
        }
    }

    private void imprimir() {
        String cadena = "";
        for (int i = 0; i < 10; i++) {
            cadena += vec[i] + " | ";

        }

        JOptionPane.showMessageDialog(null, cadena);
    }

    private int buscarMayor() {
        int mayor = vec[0];

        for (int i = 0; i < 10; i++) {

            if (vec[i] > mayor) {
                mayor = vec[i];
            }

        }

        return mayor;
    }

    private void imprimir2(int dato)
    {
        /**la instruccion JOptionPane le invocamosasu metood showMessageDialog*/
        /**configuar el icono de nuestra venta emergente.*/
        /**Para eso Importamos de clase swing el metodod ImageIcon que permite asigar cualquier icono de una ruta que le establezcamos*/
        JOptionPane.showMessageDialog(null, "El mayor es\t: "+dato, "Mostrar Info", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon("src/imagenes/joystick.png"));
    }
    
    
}
