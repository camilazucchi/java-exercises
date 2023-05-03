package Exercicios;

import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome.");
        String nomeAluno = scanner.nextLine();
        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3");
        double nota3 = scanner.nextDouble();

        double mediaNotas = (nota1 + nota2 + nota3) / 3;
        mediaNotas = Math.round(mediaNotas * 100) / 100.0;

        if(mediaNotas >= 7) {
            System.out.println(nomeAluno + ", sua média é: " + mediaNotas + "." + " Você foi aprovado(a).");
        } else if (mediaNotas <= 5) {
            System.out.println(nomeAluno + ", sua média é: " + mediaNotas + "." + "Você foi reprovado(a).");
        } else {
            System.out.println(nomeAluno + ", sua média é: " + mediaNotas + "." + " Você está de recuperação.");
        }
    }
}
