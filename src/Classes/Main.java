package Classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a classe é quem descreve a entidade.

        Pessoa objetoPessoa = new Pessoa(70d, 1.63d);

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa.");
        objetoPessoa.setPeso(leitor.nextDouble());
        System.out.println("Digite a altura da pessoa.");
        objetoPessoa.setAltura(leitor.nextDouble());

        System.out.println("Seu IMC é: " + objetoPessoa.calcularIMC());
    }
}
