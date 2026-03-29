public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match!\n");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        boolean isIncludedPlan = false;
        double average = 8.1;
        String movieName = "Top Gun: Maverick";

        average = (9.8 + 6.3 + 8.0)/3;
        System.out.printf("Média: %.2f\n",average);
        String sinopse = """
                        Filme de aventura e batalha com avião.
                        Filme com o Tom Cruise, muito top!
                        Ano de lançamento:
                        """ + releaseYear;
        System.out.println(sinopse);

        int movieRating = (int) average/2;
        System.out.printf("Classificação: %d", movieRating);
    }
}