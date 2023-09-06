import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        System.out.print("Digite o número de horas extras trabalhadas: ");
        double horasExtras = scanner.nextDouble();
        
        double valorHoraTrabalhada = salarioMinimo / 8.0;
        
        double valorHoraExtra = salarioMinimo / 4.0;
        
        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        
        double quantiaHorasExtras = horasExtras * valorHoraExtra;
        
        double salarioTotal = salarioBruto + quantiaHorasExtras;
        
        System.out.println("O salário a receber é: " + salarioTotal);
        
        scanner.close();
    }

}

