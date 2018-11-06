import java.util.Scanner;

public class Uzduotis_5b {
    public static void main(String[] args) {
        //5b. Realizuoti 4b užduotį panaudojant metodą kurio parametras būtų vartotojo įvestų
        //skaičių masyvas ir skaičių didesnių nei 100 atvaizdavimas vyktų pačiame metode.
        System.out.println("Kiek skaiciu norite ivesti?");
        int sk1 = new Scanner(System.in).nextInt();
        int[] skmas1 = new int[sk1];
        for (int i = 0; i < skmas1.length; i++) {
            skmas1[i] = new Scanner(System.in).nextInt();
        }
        Isvedimas(skmas1);

    }

    public static void Isvedimas(int[] skmas1) {
        System.out.println("Didesni uz 100 ivesti skaiciai:");
        for (int k1 : skmas1) {
            if (k1 > 100) {
                System.out.println(k1);
            }
        }
    }
}
