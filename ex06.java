import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas do funcionário: ");
        double valorVendas = scanner.nextDouble();

        double comissao = valorVendas * 0.04;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("A comissão do funcionário é: " + comissao);
        System.out.println("O salário final do funcionário é: " + salarioFinal);

        scanner.close();
    }
}
