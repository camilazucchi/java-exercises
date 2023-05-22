package Exercicios;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        // 9. Faça um algoritmo que receba um valor depositado e exiba o valor com rendimento após um mês. Considere
        // fixo o juro da poupança em 0.07% a. m.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o valor para depósito.");
        double valorDeposito = scanner.nextDouble();

        double taxaJuros = 0.07;
        double calculaRendimento = (valorDeposito * taxaJuros) / 100;
        double valorTotal = valorDeposito + calculaRendimento;
        System.out.println("O seu rendimento após 30 dias será de: " + valorTotal);

        scanner.close();
    }
}