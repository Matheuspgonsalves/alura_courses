import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String movie = sc.nextLine();

        System.out.print("Digite o ano de lançamento: ");
        int releaseYear = sc.nextInt();

        System.out.print("Digite sua nota: ");
        double average = sc.nextDouble();

        System.out.println("Filme favorito: " + movie);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Nota: " + average);
    }
}
