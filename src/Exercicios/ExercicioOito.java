package Exercicios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        // 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
        // dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
        // disponíveis com o usuário.

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite o valor da cotação do dólar atualmente.");
        double cotacaoDolar = leitor.nextDouble();

        System.out.println("Agora digite o valor que você deseja efetuar a conversão:");
        double valorDolar = leitor.nextDouble();

        double calculaCotacao = cotacaoDolar * valorDolar;

        System.out.println("O valor é:" + calculaCotacao);
    }
}
