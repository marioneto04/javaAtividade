import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário de João: ");
        double salarioJoao = scanner.nextDouble();

        System.out.print("Digite o valor da primeira conta: ");
        double primeiraConta = scanner.nextDouble();

        System.out.print("Digite o valor da segunda conta: ");
        double segundaConta = scanner.nextDouble();

        double multa = 0.02;
        double multaPrimeiraConta = primeiraConta * multa;
        double multaSegundaConta = segundaConta * multa;

        double totalAPagar = primeiraConta + segundaConta + multaPrimeiraConta + multaSegundaConta;

        double saldoRestante = salarioJoao - totalAPagar;

        System.out.println("Após o pagamento das contas, João terá um saldo restante de: " + saldoRestante);
        
        // Feche o Scanner
        scanner.close();
    }
}
