package Exercicios;

import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        System.out.println("Digite o número para identificar o intervalo.");

        int numero;

        Scanner leitorScanner = new Scanner(System.in);

        numero = leitorScanner.nextInt();

        if(numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo.");
        } else {
            System.out.println("O número não está no intervalo.");
        }
    }
}