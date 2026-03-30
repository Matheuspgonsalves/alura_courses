public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 1990;
        boolean isIncludedPlan = false;
        double average = 8.1;
        String planType = "Pro";

        if (releaseYear >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme antigo que vale a pena assistir");
        }

        if (isIncludedPlan || planType.equals("Pro")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pague a locação");
        }
    }
}
