package Java2;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by renecortez on 5/18/17.
 */
public class MoviesApplication {

    public static void main(String[] args) {
        MoviesArray listObject = new MoviesArray();//question here
        Movie[] listOfMovies = listObject.findAll();
        Input input = new Input();
        Scanner scan = new Scanner(System.in);
        int option;
        scan.nextLine();

        while (true){
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n6 - add a movie, provide name and catategory");
            System.out.println("Enter your choice:");
            option = input.getInt();
            scan.nextLine();
            switch (option){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for(Movie listOfMovie : listOfMovies){
                        System.out.println(listOfMovie.getName() + " " + listOfMovie.getCategory());
                    }
                    break;
                case 2:
                    printByCategory(listOfMovies, "animated");
                    break;
                case 3:
                    printByCategory(listOfMovies, "drama");
                    break;
                case 4:
                    printByCategory(listOfMovies, "horror");
                    break;
                case 5:
                    printByCategory(listOfMovies, "scifi");
                    break;
                case 6:
                    listOfMovies = addMovie(scan, listOfMovies);
                default:
                    System.out.println("Select another");
            }

        }
    }

    public static void printByCategory(Movie[] movies, String category){//question here
        for(Movie listOfMovie : movies){
            if(listOfMovie.getCategory().equalsIgnoreCase(category)){
                System.out.println(listOfMovie.getName() + " " + listOfMovie.getCategory());
            }
        }
    }

    public static Movie[] addMovie(Scanner scan, Movie[] listOfMovies){

        System.out.println("Give me the name:");
        String name = scan.nextLine();

        System.out.println("Give me the category:");
        String category = scan.nextLine();

        Movie newMovie = new Movie(name, category);

        //Makes a copy of the array and adds a new index position so we can add the new Movie object
        listOfMovies = Arrays.copyOf(listOfMovies, listOfMovies.length+1);
        listOfMovies[listOfMovies.length-1] = newMovie;
        return listOfMovies;

    }
}
