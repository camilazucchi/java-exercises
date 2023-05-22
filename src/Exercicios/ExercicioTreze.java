package Exercicios;

import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        // 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número.");
        int numero = scanner.nextInt();

        if(numero > 10) {
            System.out.println("O número é maior!");
        } else {
            System.out.println("O número é menor.");
        }

        scanner.close();
    }
}
