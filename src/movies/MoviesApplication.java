package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    /* Give the user a list of options for viewing all the movies or viewing movies by category.
    Use your Input class to get input from the user, and display information based on their choice.
    (Remember to import your Input class)
    If a category is selected, only movies from that category should be displayed.
    Your application should continue to run until the user chooses to exit. */
    private static final Input in = new Input();
    private static Movie[] allMovies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean cont = true;
        do {
            switch(in.getInt(-1, 7, "What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view animated movies\n3 - view drama movies\n4 - view horror movies\n5 - view scifi movies\n6 - view musical movies\n7 - view comedy movies\n-1 - add custom movie\n\nEnter your choice: ")) {
                case 0:
                    cont = false;
                    break;
                case 1:
                    displayMovies(allMovies);
                    break;
                case 2:
                    categorySearch("animated");
                    break;
                case 3:
                    categorySearch("drama");
                    break;
                case 4:
                    categorySearch("horror");
                    break;
                case 5:
                    categorySearch("scifi");
                    break;
                case 6:
                    categorySearch("musical");
                    break;
                case 7:
                    categorySearch("comedy");
                    break;
                case -1:
                    addMovie();
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (cont);
    }

    private static void displayMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }

    private static Movie titleSearch(String titleQuery) {
        for (Movie movie : allMovies) {
            if (titleQuery.equalsIgnoreCase(movie.getName())) return movie;
        }
        return null;
    }

    private static void categorySearch(String category) {
        for (Movie movie : allMovies) {
            if (category.equalsIgnoreCase(movie.getCategory()))
                System.out.println(movie.toString());
        }
    }

    private static void addMovie() {
        Movie[] newMovies = new Movie[allMovies.length + 1];

        System.arraycopy(allMovies, 0, newMovies, 0, allMovies.length);
        Movie newMovie = new Movie(
                in.getString("Enter your new movie's title:"),
                in.getString("Enter your new movie's category:"));
        newMovies[newMovies.length - 1] = newMovie;
        System.out.println(newMovie.toString());
        allMovies = newMovies;
    }
}
