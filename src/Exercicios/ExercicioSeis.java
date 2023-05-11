package Exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        // 6. Leia dois valores para as variáveis A e B, e efetue as trocas dos valores de forma que a variável A passe
        // a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresente os valores
        // trocados.
        Scanner leitor = new Scanner(System.in);

        // Lê o valor de coelhos na cartola A:
        System.out.println("Vamos fazer uma mágica? Insira uma quantidade de coelhos na cartola A: ");
        int quantidadeCoelhosCartolaA = leitor.nextInt();

        // Lê o valor de coelhos na cartola B:
        System.out.println("Agora insira outra quantidade de coelhos para a cartola B: ");
        int quantidadeCoelhosCartolaB = leitor.nextInt();

        // Mostra a quantidade de coelhos antes da troca:
        System.out.println("Antes da mágica, temos " + quantidadeCoelhosCartolaA + " coelhos na cartola A.");
        System.out.println("Antes da mágica, temos " + quantidadeCoelhosCartolaB + " coelhos na cartola B.");

        // Troca a quantidade de coelhos:
        int cartolaTemp = quantidadeCoelhosCartolaA;
        quantidadeCoelhosCartolaA = quantidadeCoelhosCartolaB;
        quantidadeCoelhosCartolaB = cartolaTemp;

        // Mostra a quantidade de coelhos após a troca:
        System.out.println("Shazam! Agora temos " + quantidadeCoelhosCartolaA + " coelhos na cartola A.");
        System.out.println("Shazam! Agora temos " + quantidadeCoelhosCartolaB + " coelhos na cartola B.");

        leitor.close();

    }
}