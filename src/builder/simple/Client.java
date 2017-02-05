package builder.simple;

/**
 * Created by mateusz on 2017-02-05.
 */
public class Client {


    public static void main(String[] args) {

        Cat cat = new Cat.Builder("Pusheen")
                .age(3)
                .color("Black")
                .owner("Matt")
                .build();
        System.out.println(cat);

    }

}
