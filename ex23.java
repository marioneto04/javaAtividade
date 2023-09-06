import java.util.Scanner;

public class ex23 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a medida do primeiro ângulo: ");
        double primeiroAngulo = scanner.nextDouble();
        
        System.out.print("Digite a medida do segundo ângulo: ");
        double segundoAngulo = scanner.nextDouble();
        
        double terceiroAngulo = 180 - (primeiroAngulo + segundoAngulo);
        
        System.out.println("A medida do terceiro ângulo é: " + terceiroAngulo + " graus");
        
        scanner.close();
    }
}
