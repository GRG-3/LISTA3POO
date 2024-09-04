import java.util.Scanner;

public class AlunoNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Variáveis para armazenar as notas
        double nota1 = 0, nota2 = 0, nota3 = 0;

        // Loop para validar a nota do primeiro trimestre
        while (true) {
            System.out.print("Digite a nota do 1º trimestre (0 a 30): ");
            nota1 = scanner.nextDouble();
            if (nota1 >= 0 && nota1 <= 30) {
                break;
            } else {
                System.out.println("Nota inválida. Por favor, digite novamente.");
            }
        }

        // Loop para validar a nota do segundo trimestre
        while (true) {
            System.out.print("Digite a nota do 2º trimestre (0 a 35): ");
            nota2 = scanner.nextDouble();
            if (nota2 >= 0 && nota2 <= 35) {
                break;
            } else {
                System.out.println("Nota inválida. Por favor, digite novamente.");
            }
        }

        // Loop para validar a nota do terceiro trimestre
        while (true) {
            System.out.print("Digite a nota do 3º trimestre (0 a 35): ");
            nota3 = scanner.nextDouble();
            if (nota3 >= 0 && nota3 <= 35) {
                break;
            } else {
                System.out.println("Nota inválida. Por favor, digite novamente.");
            }
        }

        // Cálculo da nota final
        double notaFinal = nota1 + nota2 + nota3;

        // Exibição do resultado
        System.out.println("\nAluno: " + nome);
        System.out.printf("Nota Final: %.2f\n", notaFinal);

        if (notaFinal >= 70) {
            System.out.println("Situação: Aprovado!");
        } else {
            double pontosFaltantes = 70 - notaFinal;
            System.out.printf("Situação: Reprovado! Faltaram %.2f pontos para ser aprovado.\n", pontosFaltantes);
        }

        scanner.close();
    }
}
