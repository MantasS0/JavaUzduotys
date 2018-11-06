import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        System.out.println("Iveskite skaiciu:");
        int skaicius = new Scanner(System.in).nextInt();
        if (skaicius>0){
            System.out.println("Skaiciu yra teigiamas");
        } else if (skaicius<0){
            System.out.println("Skaicius yra neigiamas");
        }else   {
            System.out.println("Skaicius yra 0");
        }

    }
}
