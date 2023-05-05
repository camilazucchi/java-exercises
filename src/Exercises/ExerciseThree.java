package Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        // 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
        // total percorrida pelo automóvel e o total de combustível gasto
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Calculadora de consumo médio de um automóvel.");

        System.out.println("Informe a distância (km) total percorrida pelo automóvel:");
        double distanceTraveledByCar = scanner.nextDouble();
        System.out.println("Informe o volume (l) de combustível gasto:");
        double fuelVolumeUsed = scanner.nextDouble();
        if(fuelVolumeUsed <= 0) {
            System.out.println("O volume (l) não pode ser zero (0).");
            return;
        }
        double averageFuelConsumption = (distanceTraveledByCar / fuelVolumeUsed);
        System.out.println("O consumo médio do seu automóvel é de: " + df.format(averageFuelConsumption) + "km/l.");
    }
}