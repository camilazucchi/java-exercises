package Exercicios;
import java.util.Scanner;

public class ExercicioVinteQuatro {
    public static void main(String[] args) {
        // 24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
        Scanner leitor = new Scanner(System.in);
        // tipo char - utilizar aspas simples!
        char desejaContinuar = 'S';

        while(desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Digite um número.");
            int numero = leitor.nextInt();
            if(numero == 0) {
                System.out.println("O número é zero.");
            } else {
                if(numero > 0 ) {
                    System.out.println("O número é maior que zero.");
                } else {
                    System.out.println("O número é menor que zero.");
                }
            }
            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = leitor.next().charAt(0);
            // chatAt(0) - primeira letra da próxima palavra digitada.
        }
    }
}