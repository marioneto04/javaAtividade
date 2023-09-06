
    import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int numero = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double resultado = numero1 * numero2 * numero3;

        System.out.println("A multiplicação dos números é igual a " + resultado);

        scanner.close();
    }
}


