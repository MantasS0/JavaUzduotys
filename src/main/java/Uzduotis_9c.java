import java.util.List;
import java.util.Scanner;

public class Uzduotis_9c {

    //Parašyti metodą kuris patikrintų ar duotas žodis yra palindromas (žodis ar sakinys kurį
    //skaitant nuo galo gaunamas tas pats žodis ar sakinys, pvz. “KOL EINU ŠUNIE LOK”, “ARGI
    //TEN NE TIGRA”). Užuomina: pašalinti tarpus ir tuomet keliauti per pusę žodžio iš abiejų
    //pusių tikrinant ar sutampa raidės.

    public static void main(String[] args) {
        System.out.println("Iveskite sakini ar zodi, kuri norite patikrint ar tai palindromas.");
        String zodis = new Scanner(System.in).nextLine();
        if (ArPalindromas(zodis)) {
            System.out.println("Sakinys ar zodis yra palindromas.");
        } else {
            System.out.println("Sakinys ar zodis nera palindromas.");
        }
    }

    public static boolean ArPalindromas(String zodis) {

        zodis = zodis.replaceAll(" ", "");
        int sum = 0;
        int zodzioPusilgis = zodis.length() / 2;

        for (int i = 0; i < zodzioPusilgis; i++) {
            System.out.println(zodis.charAt(i));
            System.out.println(zodis.charAt(zodis.length() - i - 1));
            if (zodis.charAt(i) == zodis.charAt(zodis.length() - i - 1)) {
                sum++;
            } else {
                break;
            }
        }
        if (sum == zodzioPusilgis) {
            return true;
        } else {
            return false;
        }

    }
}
