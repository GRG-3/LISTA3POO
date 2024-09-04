import java.util.Scanner;

public class TrianguloArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos lados do triângulo X
        System.out.println("Digite os lados do triângulo X:");
        System.out.print("Lado a: ");
        double aX = scanner.nextDouble();
        System.out.print("Lado b: ");
        double bX = scanner.nextDouble();
        System.out.print("Lado c: ");
        double cX = scanner.nextDouble();

        // Entrada dos lados do triângulo Y
        System.out.println("Digite os lados do triângulo Y:");
        System.out.print("Lado a: ");
        double aY = scanner.nextDouble();
        System.out.print("Lado b: ");
        double bY = scanner.nextDouble();
        System.out.print("Lado c: ");
        double cY = scanner.nextDouble();

        // Calcula a área dos triângulos usando a fórmula de Heron
        double areaX = calcularArea(aX, bX, cX);
        double areaY = calcularArea(aY, bY, cY);

        // Exibe as áreas
        System.out.printf("Área do triângulo X: %.2f\n", areaX);
        System.out.printf("Área do triângulo Y: %.2f\n", areaY);

        // Informa qual triângulo possui a maior área
        if (areaX > areaY) {
            System.out.println("O triângulo X possui a maior área.");
        } else if (areaY > areaX) {
            System.out.println("O triângulo Y possui a maior área.");
        } else {
            System.out.println("Os dois triângulos possuem a mesma área.");
        }

        scanner.close();
    }

    // Método para calcular a área do triângulo usando a fórmula de Heron
    public static double calcularArea(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
