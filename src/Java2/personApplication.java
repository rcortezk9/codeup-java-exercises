package Java2;

/**
 * Created by renecortez on 5/17/17.
 */
public class personApplication {

    public static void main(String[] args) {
        Person boy = new Person("Paul");
        System.out.println(boy.getName());

        boy.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
