package Java2;

/**
 * Created by renecortez on 5/17/17.
 */
public class personApplication {

    public static void main(String[] args) {
        Person boy = new Person("Paul");
        System.out.println(boy.getName());

        boy.sayHello();

    }
}
