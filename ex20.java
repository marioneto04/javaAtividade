import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância da parede (em metros): ");
        double distanciaParede = scanner.nextDouble();
        
        System.out.print("Digite a altura desejada (em metros): ");
        double alturaDesejada = scanner.nextDouble();
        
        double medidaEscada = Math.sqrt(distanciaParede * distanciaParede + alturaDesejada * alturaDesejada);
        
        System.out.println("A medida da escada necessária é: " + medidaEscada + " metros");
        
        scanner.close();
    }
}
