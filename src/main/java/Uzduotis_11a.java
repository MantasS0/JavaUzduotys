import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Uzduotis_11a {

    //Faile surašyti žmonių vardai. Parašyti programą kuri juos nuskaitytų ir atvaizduotų
    //ekrane. Nuskaitymui ir atvaizdavimui panaudoti atskirus metodus kuriuos kviesti iš main
    //metodo.

    public static void main(String[] args) throws FileNotFoundException {
        Isvedimas(Nuskaityti("duomenys.txt"));

    }

    public static ArrayList<String> Nuskaityti(String failas) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(failas));
        ArrayList<String> sarasas1 = new ArrayList<>();
        while (scanner.hasNext()) {
            sarasas1.add(scanner.next());
        }
        return sarasas1;
    }

    public static void Isvedimas(ArrayList<String> sarasas) {
        System.out.println(sarasas);
    }

}
