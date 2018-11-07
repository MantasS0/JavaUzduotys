import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Uzduotis_13a {
    //Faile kiekvienoje eilutėje surašytas žmogaus vardas ir amžius. Parašyti programą kuri
    //nuskaitytų duomenis į HashMap tipo duomenų struktūrą, tuomet leistų vartotojui įvesti
    //norimą vardą, ir jei šis buvo duomenų faile, atvaizduoti to žmogaus amžių. Nuskaitymui ir
    //atvaizdavimui panaudoti atskirus metodus kuriuos kviesti iš main metodo.
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,Integer> map = new HashMap<>();
        nuskaitytiDuomenisIsFailo(map);
        ivedimas(map);

        //Pavyzdys

//        map.put("vardas","Arnas");
//        map.put("vardas","Antanas");
//        map.put("kitas","Arnas");
//        String reiksme = map.get("vardas");
//        System.out.println(reiksme);
//        System.out.println(map.get("kitas"));
//        System.out.println("Map dydis: " + map.size());
    }

    private static void nuskaitytiDuomenisIsFailo(HashMap<String, Integer> map) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Uzduoties_13a_duomenys.txt"));
        while(scanner.hasNext()){
            String vardas = scanner.next();
            if(scanner.hasNextInt()){
                int amzius = scanner.nextInt();
                map.put(vardas,amzius);
            }
        }
    }

    private static void ivedimas(HashMap<String,Integer> map){
        System.out.println("Iveskie varda");
        String vardas = new Scanner(System.in).next();
        if (map.containsKey(vardas)){
            System.out.println("Vardas yra duomenu bazeje");
            System.out.println("Amzius: " + map.get(vardas));
        }else {
            System.out.println("Vardo nera duomenu bazeje");
        }
    }


}
