import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        double desconto = precoProduto * 0.10;

        double novoPreco = precoProduto - desconto;

        System.out.println("O novo preço do produto com desconto de 10% é: " + novoPreco);

        scanner.close();
    }
}
