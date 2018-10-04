
import java.util.Random;

public class Main {
    public static void  main (String[] args){
        Random rand = new Random();


        System.out.println("Hello World");
        System.out.println("Shrekspacito 4");

        int shrek = rand.nextInt(10);
    while (true) {
        shrek = rand.nextInt(10);
        if (shrek <= 5)
            System.out.println("correct");
        else
            System.out.println("ur fattest gay");
    }
    }
}
