import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Armazena o salário antigo
        double salarioAntigo = salario;

        // Aplicação do aumento baseado no salário
        if (salario >= 1 && salario <= 1000) {
            salario += salario * 0.15;
        } else if (salario >= 1001 && salario <= 1500) {
            salario += salario * 0.10;
        } else if (salario >= 1501 && salario <= 2000) {
            salario += salario * 0.05;
        }

        // Exibição dos resultados
        System.out.printf("Nome do Funcionário: %s%n", nome);
        System.out.printf("Salário Antigo: R$ %.2f%n", salarioAntigo);
        System.out.printf("Novo Salário: R$ %.2f%n", salario);

        scanner.close();
    }
}
