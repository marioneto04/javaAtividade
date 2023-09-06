import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de dinheiro em reais: ");
        double dinheiroEmReais = scanner.nextDouble();
        
        double cotacaoDolar = 1.80;
        double cotacaoMarcoAlemao = 2.00;
        double cotacaoLibraEsterlina = 3.57;
        
        double dinheiroEmDolares = dinheiroEmReais / cotacaoDolar;
        double dinheiroEmMarcosAlemaes = dinheiroEmReais / cotacaoMarcoAlemao;
        double dinheiroEmLibrasEsterlinas = dinheiroEmReais / cotacaoLibraEsterlina;
        
        System.out.println("Quantidade em dólares: " + dinheiroEmDolares);
        System.out.println("Quantidade em marcos alemães: " + dinheiroEmMarcosAlemaes);
        System.out.println("Quantidade em libras esterlinas: " + dinheiroEmLibrasEsterlinas);
        
        scanner.close();
    }
}
