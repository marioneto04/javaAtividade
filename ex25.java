import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();
        
        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();
        
        int horaEmMinutos = hora * 60;
        
        int totalMinutos = minutos + horaEmMinutos;
        
        int totalSegundos = totalMinutos * 60;
        
        System.out.println("Hora digitada convertida em minutos: " + horaEmMinutos + " minutos");
        System.out.println("Total de minutos: " + totalMinutos + " minutos");
        System.out.println("Total de minutos convertidos em segundos: " + totalSegundos + " segundos");
        
        scanner.close();
    }
}
