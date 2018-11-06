import org.omg.PortableInterceptor.NON_EXISTENT;

import java.util.Scanner;

public class Uzduotis_3b {
    public static void main(String[] args){
        //Parašyti programą kuri paprašytų vartotojo įvesti 5 žodžius. Po to kai bus įvesti visi
        //žodžiai, jie turi būti atvaizduojami.
        String sum = "";
        String mas1 [] = new String[5];
        for (int i = 0; i<mas1.length;i++){
            System.out.println("Iveskite " +(i+1)+ "-aji zodi:");
            mas1[i] = new Scanner(System.in).next();
            sum +=" " + mas1[i];
        }
        System.out.println(sum);
    }
}
