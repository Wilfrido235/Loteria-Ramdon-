package ejerciciorandom;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioRandom {

    public static void main(String[] args) {
        Random r = new Random();
        int ram = r.nextInt(10) + 1;

        String[] numeros = new String[5];

        String num = " ";

        int i = 0, x = 0, cantidadnumeros = numeros.length;

        boolean salir = false, existe = false;

        while (i < cantidadnumeros && salir == false) {

            try {
                num = JOptionPane.showInputDialog("Ingresa numeros del 1 al 10 para el sorteo ");

                if (num.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero ");
                } else {

                    x = 0;
                    existe = false;

                    if (i > 0) {
                        while (x < cantidadnumeros && existe == false) {
                            if (numeros[x] != null && numeros[x].equals(num)) {
                                existe = true;
                                JOptionPane.showMessageDialog(null, "El numero ya esta ingresado");
                            }
                            x++;
                        }
                    }

                    if (existe == false) {
                        numeros[i] = num;
                        i++;

                    }

                }

            } catch (NullPointerException e) {
                salir = true;
            }

        }

        System.out.println("************** Numeros ingresados para el sorteo  **************");
        System.out.println("******El numero random es: " + ram + " ********");
        for (String valores : numeros) {
            System.out.println("Numero a comprobrar: " + valores);
            int numEntero = Integer.parseInt(valores);

            if (ram != numEntero) {
                System.out.println("Su numero ingresado es incorecto a perdido");
            } else {
                System.out.println("Su numero ingresado es corecto a ganado FELICIDADES");
            }
        }
    }
}

