import java.util.Scanner;

public class ex08 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa em quilos: ");
        double pesoKilos = scanner.nextDouble();

        double pesoGramas = pesoKilos * 1000;

        System.out.println("O peso da pessoa em gramas é: " + pesoGramas + " gramas");

        scanner.close();
    }
}
