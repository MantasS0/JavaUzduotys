import java.util.Scanner;

public class Uzduotis_9a {
    public static void main(String[] args) {
//Parašyti metodą kuris suskaičiuoja kiek per parametrus paduotame žodyje yra raidžių
//“a”. Prieš atliekant veiksmus patikrinti ar paduotas žodis nėra null, jeigu yra, grąžinti 0.
        System.out.println("Iveskite zodi kurio norite skaiciuoti raides 'a'.");
        String zodis = new Scanner(System.in).nextLine();
        System.out.println(zodis + " turi " + KiekA(zodis) + " raides 'a'.");

    }

    public static int KiekA(String zodis) {
        int sk1 = 0;
        if (zodis == null) {
            return 0;
        } else {
            for (int i = 0; i < zodis.length(); i++) {
                if (zodis.charAt(i) == 'a') {
                    sk1++;
                }
            }
            return sk1;
        }
    }
}
