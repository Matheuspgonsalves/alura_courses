package br.com.matheuspg.screenMatch.model;

public class Movie {
    private String name;
    private boolean isIcludedPlan;
    private int releaseYear;
    private String sinopse;
    private double sumUsersRating;
    private int totalUsersRating;
    private int duration;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsIcludedPlan() {
        return isIcludedPlan;
    }

    public void setIcludedPlan(boolean icludedPlan) {
        isIcludedPlan = icludedPlan;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setSumUsersRating(double sumUsersRating) {
        this.sumUsersRating = sumUsersRating;
    }

    public int getTotalUsersRating() {
        return totalUsersRating;
    }

    public void setTotalUsersRating(int totalUsersRating) {
        this.totalUsersRating = totalUsersRating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void showMovieInfo () {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Incluído no plano: " + (isIcludedPlan ? "Sim" : "Não"));
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Total de avaliações: " + totalUsersRating);
        System.out.printf("Rate: %.2f\n", getAverageRating());
        System.out.println("Duração do filme: " + duration);
    }

    public void addRating(double userRating) {
        totalUsersRating++;
        this.sumUsersRating += userRating;
    }

    public double getAverageRating() {
        return sumUsersRating/totalUsersRating;
    }
}
