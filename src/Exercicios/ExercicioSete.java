package Exercicios;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        // 7. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. A fórmula de
        // conversão é: F = (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

        Scanner leitor = new Scanner(System.in);

        // Lê o valor da temperatura em graus Celsius:
        System.out.println("Digite a temperatura em graus Celsius (exemplo: 25.5):");
        double temperaturaCelsius = leitor.nextDouble();

        // Converte a temperatura de Celsius para Fahrenheit:
        double conversorTemperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.println("A temperatura convertida para Fahrenheit é: " + conversorTemperaturaFahrenheit);
    }
}
