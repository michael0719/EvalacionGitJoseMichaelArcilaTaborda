package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre: ");

        JOptionPane.showMessageDialog(null,"Su nombre es: "+nombre,"Mensaje", JOptionPane.WARNING_MESSAGE);


    }

}
