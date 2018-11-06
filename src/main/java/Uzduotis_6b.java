import java.util.Scanner;

public class Uzduotis_6b {
    public static void main(String[] args) {
        //Sukurti supaprastintą skaičiuoklės programą kuri paprašytų įvesti du skaičius ir
        //operacijos tarp jų skaičių (1 – suma, 2 – skirtumas, 3 – sandauga). Gautą rezultatą
        //programa pavaizduotų ekrane ir paklaustų ar norėsime kartoti. Įvedus skaičių 5, programa
        //turėtų kartoti darbą iš naujo, priešingu atveju programa baigtų darbą.
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double sk1;
        double sk2;
        String veiksmas = "";
        String kartoti = "";
        do {
            System.out.println("Iveskite 1-aji skaiciu:");
            sk1 = scanner.nextDouble();
            System.out.println("Iveskite 2-aji skaiciu:");
            sk2 = scanner.nextDouble();
            System.out.println("Iveskite + , - arba *");
            veiksmas = scanner.next();
            if (veiksmas.equals("+")){
                sum = sk1 + sk2;
            }
            else if (veiksmas.equals("-")){
                sum = sk1 - sk2;
            }
            else if (veiksmas.equals("*")){
                sum = sk1*sk2;
            }else{
                System.out.println("Ivedete netinkama simboli.");
                continue;
            }
            System.out.println("Gautas rezultatas: " + sum);
            System.out.println("Ar noresite kartoti? (Ivedus 5 - kartosim, ivedus kita simboli - baigsim darba");
            kartoti = scanner.next();
        }while (kartoti.equals("5"));

    }
}
