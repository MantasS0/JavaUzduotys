import java.util.Scanner;

public class Uzduotis_4a {
    public static void main(String[] args){
        //Parašyti programą kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis
        //paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
        System.out.println("Iveskite savo svori:");
        float svoris = new Scanner(System.in).nextFloat();
        System.out.println("Iveskite savo ugi:");
        float ugis = new Scanner(System.in).nextFloat();
        double kmi = svoris / (Math.pow(ugis,2));
        System.out.println("Jusu kuno mases indeksas yra: " + kmi);
    }
}
