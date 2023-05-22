package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        // 10. A loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um algoritmo
        // que receba um valor de uma compra e mostre o valor das prestações.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        if (valorCompra <= 0) {
            System.out.println("Valor inválido. O valor da compra deve ser maior que zero.");
        }

        System.out.println("Por favor, escolha em quantas prestações você gostaria de parcelar sua compra:");
        int numeroPrestacoes = scanner.nextInt();

        if (numeroPrestacoes < 1 || numeroPrestacoes > 5) {
            System.out.println("Número de prestações inválido. Por favor, escolha um número de 1 a 5.");
            return;
        }

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");

        switch (numeroPrestacoes) {
            case 1 -> System.out.println("Obrigada por comprar conosco! Você escolheu pagar em uma vez: "
                    + valorCompra + ".");
            case 2 -> System.out.println("Obrigada por comprar conosco! Você escolheu parcelar em duas vezes: "
                    + df.format(valorCompra / 2));
            case 3 -> System.out.println("Obrigada por comprar conosco! Você escolheu parcelar em três vezes: "
                    + df.format(valorCompra / 3));
            case 4 -> System.out.println("Obrigada por comprar conosco! Você escolheu parcelar em quatro vezes: "
                    + df.format(valorCompra / 4));
            case 5 -> System.out.println("Obrigada por comprar conosco! Você escolheu parcelar em cinco vezes: "
                    + df.format(valorCompra / 5));
        }

        scanner.close();
    }
}