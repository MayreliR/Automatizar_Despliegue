/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package numerosmedios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author May
 */
public class NumerosMedios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Ingrese 2 números de su preferencia");
        System.out.print("Primer número:");
        numero1 = sc.nextInt();
        System.out.print("Segundo número:");
        numero2 = sc.nextInt();

        ArrayList<Integer> numerosMedios = calcularNumerosMedios(numero1, numero2);
        // Cambie el método que imprime los números en el rango para que ahora imprima
        // solo los números impares en el rango.
        // Debe cambiar el método existente. Ajuste las pruebas para reflejar este nuevo
        // requisito. Confirme los cambios en Feature.
        for (int numero : numerosMedios) {
            System.out.println(numero);
        }
    }

    public static ArrayList<Integer> calcularNumerosMedios(int num1, int num2) {
        // Para poder calcular los números que se encuentran en medio del número 1 y
        // número 2
        int numeroInicial = num1;
        // Para poder saber hay números en medio del número 1 y número 2
        int diferencia = num1 - num2;
        // Lista de los números medios
        ArrayList<Integer> numerosMedios = new ArrayList<>();
        // Si hay números entre el número 1 y número 2
        if (num1 != num2 && diferencia != 1 && diferencia != -1) {
            System.out.println(
                    "Los número que se encuentran en medio del número " + num1 + " y el número " + num2 + " son:");
            if (num1 > num2) {
                for (int i = 0; i < num1 - num2 - 1; i++) {
                    numeroInicial--;
                    if (numeroInicial % 2 != 0) {
                        numerosMedios.add(numeroInicial);
                    }
                }
            } else if (num2 > num1) {
                for (int i = 0; i < num2 - num1 - 1; i++) {
                    numeroInicial++;
                    if (numeroInicial % 2 != 0) {
                        numerosMedios.add(numeroInicial);
                    }
                }
            }
        } // Si no hay números en medio del número 1 y número 2
        else if (num1 == num2 || diferencia == 1 || diferencia == -1) {
            System.out.println("No hay números en medio");
        }
        return numerosMedios;

    }
}
