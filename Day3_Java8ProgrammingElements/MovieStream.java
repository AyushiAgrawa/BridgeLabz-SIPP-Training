package JavaFeature.Day3_Java8ProgrammingElements;

import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    double rating;
    int releaseYear;
    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
    public String toString() { return title + " (" + releaseYear + ") Rating: " + rating; }
}

public class MovieStream {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.1, 2022),
            new Movie("Movie C", 7.8, 2021),
            new Movie("Movie D", 8.9, 2023),
            new Movie("Movie E", 9.0, 2023),
            new Movie("Movie F", 8.7, 2022)
        );

        movies.stream()
              .sorted(Comparator.comparing(Movie::getRating).reversed()
                                .thenComparing(Movie::getReleaseYear).reversed())
              .limit(5)
              .forEach(System.out::println);
    }
}
