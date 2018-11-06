import java.util.Scanner;

public class Uzduotis_7a {
    public static void main(String[] args) {
        int sk1 = 1;
        int sum = 0;
        while (true) {
            System.out.println("Iveskite sveika skaiciu:");
            sk1 = new Scanner(System.in).nextInt();
            if (sk1 > 0) {
                for (int i = 0; i <= sk1; i++) {
                    sum += i;
                }
                System.out.println("Suma nuo 0 iki ivesto skaiciaus yra: " + sum);
                break;
            } else {
                System.out.println("Ivedete netinkama skaiciu. Bandykite dar karta.");
                continue;
            }
        }
    }
}
