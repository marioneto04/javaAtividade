import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int idadeAnos = anoAtual - anoNascimento;

        LocalDate dataNascimento = LocalDate.of(anoNascimento, 1, 1);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);

        long diasTotais = periodo.getDays();
        int idadeSemanas = (int) (diasTotais / 7);

        System.out.println("Idade em anos: " + idadeAnos + " anos");
        System.out.println("Idade em meses: " + periodo.getMonths() + " meses");
        System.out.println("Idade em dias: " + periodo.getDays() + " dias");
        System.out.println("Idade em semanas (aproximadamente): " + idadeSemanas + " semanas");
        
        scanner.close();
    }
}
