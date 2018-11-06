import java.util.Random;
import java.util.Scanner;

public class Uzduotis_6a {
    public static void main(String[] args) {
        Random rand = new Random();

        do {
            System.out.println("Spekite skaiciu nuo 1 iki 10");
            int randomNumber = rand.nextInt(10) + 1;
            int spejimas = new Scanner(System.in).nextInt();
            if (spejimas == 0) {
                break;
            } else if (spejimas == randomNumber) {
                System.out.println("Atspejai!");
                break;
            }
        } while (true);
    }
}
