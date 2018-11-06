import java.util.Scanner;

public class Uzduotis_3a {
    public static void main(String[] args) {
        //Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių įvedimą, turi būti
        //atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.
        int sum = 0;
        int[] mas1 = new int[5];
        for (int i = 0; i < mas1.length; i++) {
            System.out.println("Ivestike " + (i+1) + "-aji skaiciu:");
            mas1[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Jus ivedete:");
        //mas1.for ir ENTER
        for (int sk1 : mas1) {
            System.out.println(sk1);
            sum += sk1;
        }
        System.out.println("Skaiciu suma: " + sum);

    }
}
