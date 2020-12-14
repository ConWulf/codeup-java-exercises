package movies;

import arraysLecture.ArraysLec;
import util.Input;

import java.util.*;

public class MoviesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        Scanner sc = new Scanner(System.in);
        List<Movie> movieList = new ArrayList<>(Arrays.asList(MoviesArray.findAll()));
        selectMovie(input, sc, movieList);

    }

    public static void selectMovie(Input input, Scanner sc, List<Movie> movie) {
        input.getString();
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n"+
                "6 - view movies with no category\n"+
                "7 - add a movie\n");
       int choice = input.getInt(0, 7);
       switch (choice) {
           case 0:
               System.exit(0);
           case 1:
               for (Movie movies: movie) {
                   System.out.printf("%s -- %s\n", movies.getName(), movies.getCategory());
               }
               break;
           case 2:
               for (Movie movies: movie) {
                if (movies.getCategory().equalsIgnoreCase("animated"))  System.out.printf("%s -- %s\n", movies.getName(), movies.getCategory());
               }
               break;
           case 3:
               for (Movie movies: movie) {
                   if (movies.getCategory().equalsIgnoreCase("drama"))  System.out.printf("%s -- %s\n", movies.getName(), movies.getCategory());
               }
               break;
           case 4:
               for (Movie movies: movie) {
                   if (movies.getCategory().equalsIgnoreCase("horror"))  System.out.printf("%s -- %s\n", movies.getName(), movies.getCategory());
               }
               break;
           case 5:
               for (Movie movies: movie) {
                   if (movies.getCategory().equalsIgnoreCase("scifi"))  System.out.printf("%s -- %s\n", movies.getName(), movies.getCategory());
               }
               break;
           case 6:
               for (Movie movies: movie) {
                   if (movies.getCategory().equalsIgnoreCase("unassigned"))  System.out.printf("%s -- %s\n", movies.getName(), movies.getCategory());
               }
               break;
           default:
               addMovie(sc, movie);
       }
       if (!input.yesNo()) System.exit(0);
       selectMovie(input, sc, movie);
    }

public static void addMovie(Scanner sc, List<Movie> movies) {
    System.out.println("please enter the name, hit enter, then enter a genre.");
    String name = sc.nextLine().trim().toLowerCase();
    String genre = sc.nextLine().trim().toLowerCase();
    if (genre.equals("")) movies.add(new Movie(name));
    else movies.add(new Movie(name, genre));
    System.out.printf("You added %s", name);
}

}
