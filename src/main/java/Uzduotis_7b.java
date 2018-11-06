import java.util.Scanner;

public class Uzduotis_7b {
    public static void main(String[] args) {
//Parašyti programą kuri paprašo vartotojo įvesti skaičių n, tuomet leidžia pasirinkti ką
//suskaičiuoti, skaičių nuo 1 iki n sumą arba sandaugą (1 - suma, 2 - sandauga). Jeigu įvestas
//skaičius mažesnis nei vienas, programa turi informuoti apie blogą įvestį.
        int sk1 = 1;
        int sum = 0;
        String simbolis = "";
        while (true) {
            System.out.println("Iveskite sveika teigiama skaiciu:");
            sk1 = new Scanner(System.in).nextInt();
            System.out.println("Iveskite + arba * :");
            simbolis = new Scanner(System.in).next();
            if (sk1 > 0 && simbolis.equals("+")) {
                for (int i = 0; i <= sk1; i++) {
                    sum += i;
                }
                System.out.println("Suma nuo 0 iki ivesto skaiciaus yra: " + sum);
                break;
            }else if (sk1 > 0 && simbolis.equals("*")){
                sum = 1;
                for (int i = 1; i <= sk1; i++) {
                    sum *= i;
                }
                System.out.println("Sandauga nuo 0 iki ivesto skaiciaus yra: " + sum);
                break;
            }else {
                System.out.println("Ivedete netinkama skaiciu arba simboli. Bandykite dar karta.");
                continue;
            }
        }


    }
}
