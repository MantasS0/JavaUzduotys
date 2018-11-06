import java.util.Scanner;

public class Uzduotis_2b {
    public static void main(String[] args) {
        //2b. Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje
        //turi būti atvaizduojama įvestų skaičių suma.
        int sum = 0;
        int skaicius;
        do {
            System.out.println("Iveskite skaiciu:");
            skaicius = new Scanner(System.in).nextInt();
            sum += skaicius;
        } while (skaicius != 0);
        System.out.println("Jusu ivestu skaiciu suma " + sum);

    }

}
