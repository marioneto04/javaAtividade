import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;

        System.out.println("A média ponderada das notas é igual a " + mediaPonderada);

        scanner.close();
    }
}
