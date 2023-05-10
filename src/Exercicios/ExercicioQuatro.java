package Exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        // 4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
        //por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
        //efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, vendedor(a)! Digite o seu nome:");
        String nomeVendedor = scanner.next();
        System.out.println("Olá, " + nomeVendedor + ". " + "Digite o seu salário fixo:");
        double salarioFixo = scanner.nextDouble();
        // Entrada para o valor total de vendas efetuadas:
        System.out.println("Digite o valor total de vendas efetuadas:");
        double vendasEfetuadas = scanner.nextDouble();
        // Cálculo de comissão:
        double taxaDeComissao = 0.15;
        double calculaComissao = (vendasEfetuadas * taxaDeComissao);
        // Cálculo do salário final (salário fixo + comissão das vendas):
        double calculaSalarioFinal = (salarioFixo + calculaComissao);
        System.out.println(nomeVendedor + ", o seu salário fixo é de: " + salarioFixo + ".");
        System.out.println("Sua comissão é de: " + calculaComissao + ".");
        System.out.println("Seu salário final é: " + calculaSalarioFinal + ".");
    }
}
