package Java2;

/**
 * Created by renecortez on 5/18/17.
 */
public class MoviesApplication {
    public static void main(String[] args) {
        MoviesArray listObject = new MoviesArray();
        Movie[] listOfMovies = listObject.findAll();
        Input input = new Input();
        int option;

        do{
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            System.out.println("Enter your choice:");
            option = input.getInt();
            switch (option){
                case 0:
                    System.out.println("Good Bye");
                    break;
                case 1:
                    for(Movie listOfMovie : listOfMovies){
                        System.out.println(listOfMovie.getName() + " " + listOfMovie.getCategory());
                    }
                    break;
                case 2:
                    for(Movie listOfMovie : listOfMovies){
                        if(listOfMovie.getCategory().equalsIgnoreCase("animated")){
                            System.out.println(listOfMovie.getName() + " " + listOfMovie.getCategory();
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Select another");
            }

        } while (option != 0);
    }
}
