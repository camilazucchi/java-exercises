package Exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        // 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        // No final, informar o nome do aluno e a sua média (aritmética).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá estudante, digite seu nome:");
        String nomeEstudante = scanner.next();

        System.out.println(nomeEstudante + ", digite a primeira nota:");
        double notaProvaUm = scanner.nextDouble();

        System.out.println(nomeEstudante + ", digite a segunda nota:");
        double notaProvaDois = scanner.nextDouble();

        System.out.println(nomeEstudante + ", digite a terceira nota:");
        double notaProvaTres = scanner.nextDouble();

        double mediaDasNotas = (notaProvaUm + notaProvaDois + notaProvaTres) / 3;
        System.out.println(nomeEstudante + ", sua média é: " + mediaDasNotas + ".");

    }
}
