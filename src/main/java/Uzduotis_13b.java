import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Uzduotis_13b {
    //Faile kiekvienoje eilutėje surašytas žmogaus vardas ir jo mėgstama spalva. Parašyti
    //programą kuri nuskaitytų duomenis į HashMap tipo duomenų struktūrą, tuomet leistų
    //vartotojui įvesti norimą vardą, ir jei šis buvo duomenų faile, atvaizduoti to žmogaus
    //mėgstamą spalvą. Nuskaitymui ir atvaizdavimui panaudoti atskirus metodus kuriuos kviesti iš
    //main metodo.

    private static HashMap<String,String> map = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        nuskaitytiDuomenisIsFailo();
        ivedimas();

    }

    private static void nuskaitytiDuomenisIsFailo() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Uzduoties_13b_duomenys.txt"));
        while(scanner.hasNextLine()){
            String eilute = scanner.nextLine();
            String[] s = eilute.split(" ");
            if (s.length >= 2){
                    String vardas = s[0];
                    String spalva = s[1];
                    map.put(vardas,spalva);
            }

//            if (eilute.contains(" ")){
//
//            }

        }
    }

    private static void ivedimas(){
        System.out.println("Iveskie varda");
        String vardas = new Scanner(System.in).next();
        if (map.containsKey(vardas)){
            System.out.println("Vardas yra duomenu bazeje");
            System.out.println("Megstamiausia spalva: " + map.get(vardas));
        }else {
            System.out.println("Vardo nera duomenu bazeje");
        }
    }
}
