import java.util.Scanner;

public class Uzduotis_2a {
    /*2a. Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų, tada vėl
paprašytų įvesti kitą žodį, jį atvaizduotų, ir procesą kartotų tol, kol nebus įvestas žodis
„pabaiga“.*/
    public static void main(String[] args) {
        String end = "pabaiga";
        while(true){
            System.out.println("Iveskite zodi. Jei norite baigti iveskite pabaiga.");
            String zodis = new Scanner(System.in).nextLine();
            System.out.println(zodis);
            if (zodis.equals(end)){
                //galima rasyti zodis.equals("pabaiga")
                break;
            }
        }



    }

}
