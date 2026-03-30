import br.com.matheuspg.screenMatch.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie favoriteMovie = new Movie();
        favoriteMovie.setName("Shrek");
        favoriteMovie.setReleaseYear(2012);
        favoriteMovie.setIcludedPlan(true);
        favoriteMovie.setDuration(130);
        favoriteMovie.setSinopse("""
                Filme de desenho de um ogro que pega uma princesa e transforma
                ela em um ogro tambem (descrição bizarra).
                """);
        favoriteMovie.showMovieInfo();
    }
}