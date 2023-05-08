package estruturaWhile;

import java.util.Scanner;

public class estruturaWhile {
    public static void main(String[] args) {
        // a condição de parada precisa ser LÓGICA!
        int totalAlunos = 5;
        Scanner leitor = new Scanner(System.in);
        while (totalAlunos > 0) {
            String nomeAluno = leitor.nextLine();
            int idadeAluno = leitor.nextInt();

            System.out.println("O nome do aluno é: " + nomeAluno + "." + " E a sua idade é: " + idadeAluno + ".");
            totalAlunos = totalAlunos - 1;
        }
    }
}