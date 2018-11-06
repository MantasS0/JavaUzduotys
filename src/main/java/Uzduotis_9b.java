import java.util.Scanner;

public class Uzduotis_9b {

    //Parašyti metodą kuris patikrina kiek per parametrus paduotame žodyje yra raidžių
    //derinių “ab”. Prieš atliekant veiksmus patikrinti ar paduotas žodis yra null, jei taip, grąžinti 0.
    //Užuomina: radus “a” raidę tikrinti ar sekanti raidė (i + 1) yra “b”.

    public static void main(String[] args) {
        System.out.println("Iveskite zodi kurio norite skaiciuoti raides 'ab'.");
        String zodis = new Scanner(System.in).nextLine();
        System.out.println(zodis + " turi " + KiekAB(zodis) + " raides 'ab'.");
    }

    public static int KiekAB(String zodis) {
        int sk1 = 0;
        if (zodis.equals("null")) {
            return 0;
        } else {
            for (int i = 0; i < zodis.length()-1; i++) {
                if (zodis.charAt(i) == 'a') {
                    if (zodis.charAt(i + 1) == 'b') {
                        sk1++;
                    }
                }
            }
            return sk1;
        }
    }
}


