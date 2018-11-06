import java.util.Scanner;

public class Uzduotis_1b {
    public static void main(String[] args){
        System.out.println("Iveskite varda:");
        String vardas = new Scanner(System.in).nextLine();
        for (int i =0;i<5;i++){
            System.out.println("Sveiki, " + vardas);
        }


    }
}
