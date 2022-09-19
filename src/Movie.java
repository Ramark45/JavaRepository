public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie(String t, String s, String r) {
        title = t;
        studio = s;
        rating = r;
    }

    public Movie (String t, String s) {
        title = t;
        studio = s;
        rating = "PG";
    }

    public static Movie[] getPG(Movie[] mov) {
        Movie[] pgMov = new Movie[mov.length];
        int newArrayIndex = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                pgMov[newArrayIndex] = mov[i];
                newArrayIndex++;
            }
        }
        return pgMov;
    }

    public static void main(String[] args) {
        Movie movi = new Movie("Casino Royale","Eon Productions","PG-13");
        //Movie mov1 = new Movie("Casino","Productions","PG-14");
        Movie[] movie = new Movie[1];
        movie[0]=movi;
        //movie[1]=mov1;
        System.out.println(getPG(movie));


    }
   // Movie mov = new Movie("Casino Royale","Eon Productions","PG-13");

}
