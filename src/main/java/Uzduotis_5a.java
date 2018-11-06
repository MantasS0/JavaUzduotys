import java.util.Scanner;

public class Uzduotis_5a {
    public static void main(String[] args) {
        System.out.println("Iveskite savo svori:");
        float svoris = new Scanner(System.in).nextFloat();
        System.out.println("Iveskite savo ugi:");
        float ugis = new Scanner(System.in).nextFloat();
        System.out.println("Jusu kuno mases indeksas yra: " + KmiMetodas(svoris,ugis));
    }
    public static double KmiMetodas(float svoris, float ugis) {
        double kmi = svoris / (Math.pow(ugis,2));
        return kmi;
    }
}
