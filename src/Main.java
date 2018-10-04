
import java.util.Random;

public class Main {
    public static void  main (String[] args){
        Random rand = new Random();


        System.out.println("Hello World");
        System.out.println("Shrekspacito 4");

        int shrek = rand.nextInt(10);
    while (true) {
        shrek = rand.nextInt(10);
        if (shrek <= 3)
            System.out.println("ight lets go save the princess");
        else if (shrek <= 8)
            System.out.println("ur fattest gay");
        else
            System.out.println("wassup my dankey");
    }
    }
}
