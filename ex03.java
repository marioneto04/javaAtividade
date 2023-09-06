import java.util.Scanner;

public class ex03 {
      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número (não pode ser zero): ");
        double numero2 = scanner.nextDouble();
        
        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é igual a " + resultado);

        scanner.close();
    }
}
