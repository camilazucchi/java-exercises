package Exercicios;

import java.util.Scanner;

public class ExercicioVinteDois {
    public static void main(String[] args) {
        // 22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
        // se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor de
        // venda de cada produto, a média de preço de custo e do preço de venda.

        String nomeProduto;
        double precoCusto;
        double precoVenda;
        double totalCusto = 0;
        double totalVenda = 0;
        Scanner leitor = new Scanner(System.in);
        int i = 0;

        for(; i < 4; i++) {
            System.out.println("Digite o nome do produto.");
            nomeProduto = leitor.next();

            System.out.println("Digite o preço de custo do produto.");
            precoCusto = leitor.nextDouble();

            System.out.println("Digite o preço de venda do produto.");
            precoVenda = leitor.nextDouble();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if(precoCusto == precoVenda) {
                System.out.println("Houve um empate entre o preço de custo e de venda.");
            } else {
                if(precoCusto > precoVenda) {
                    System.out.println("Prejuízo.");
                } else {
                    System.out.println("Lucro.");
                }
            }

            System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = " + precoVenda);


        }
        System.out.println("A média do preço de custo é de: " + (totalCusto / (double) i));
        System.out.println("A média do preço de venda é de: " + (totalVenda / (double) i));
    }
}
