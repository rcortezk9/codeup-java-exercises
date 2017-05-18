package Java2;

import java.util.Random;

/**
 * Created by renecortez on 5/18/17.
 */
public class nameGenerator {
    public static void main(String[] args) {

        String[] adj = {"Tall", "Fat", "Hairy", "Shorty", "Smelly", "Slim", "Angry", "Crazy", "Happy", "Sad"};

        String[] noun = {"Boy", "Girl", "House", "Car", "Mom", "Dad", "Bed", "Toy", "Fish", "Dog"};

        Random random = new Random();
        int index1 = random.nextInt(adj.length);
        int index2 = random.nextInt(noun.length);

        System.out.println(adj[index1] + " - " + noun[index2]);

    }
}
