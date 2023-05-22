package Exercicios;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        /* 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
        Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário. */
        Scanner scanner = new Scanner(System.in);

        // Entrada de informações:
        System.out.println("Insira o preço de custo do produto.");
        double precoCustoProduto = scanner.nextDouble();
        System.out.println("Insira o percentual de acréscimo do produto.");
        double percentualAcrescimo = scanner.nextDouble();

        // Cálculo do valor de venda:
        double valorDeVendaProduto = precoCustoProduto + (precoCustoProduto * percentualAcrescimo / 100);

        System.out.println("O valor de venda do produto é de: " + valorDeVendaProduto);
    }
}
