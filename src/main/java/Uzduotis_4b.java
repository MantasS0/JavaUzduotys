import java.util.List;
import java.util.Scanner;

public class Uzduotis_4b {
    public static void main(String[] args) {
        //Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek
        //skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.

        //sukurt metoda CTRL+ALT+M (Pazymejus ka nori iskelt i metoda)
        System.out.println("Kiek skaiciu norite ivesti?");
        int sk1 = new Scanner(System.in).nextInt();
        int[] skmas1 = new int[sk1];
        for (int i = 0; i < skmas1.length; i++) {
            skmas1[i] = new Scanner(System.in).nextInt();
        }
        //FOREACH Shortcut "PVADINIMAS.FOR + TAB
        System.out.println("Didesni uz 100 ivesti skaiciai:");
        for (int k1: skmas1) {
            if (k1>100){
                System.out.println(k1);}
        }
    }
}
