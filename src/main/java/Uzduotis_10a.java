import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Uzduotis_10a {

    //Turime sąrašą: [2, 5, 1, 9, -999, 9879, 55, 26] Parašyti metodą kuris grąžintų tokį patį
    //sąrašą surikiuotą didėjimo tvarka.
    //Collections.sort(...)

    public static void main(String[] args) {
        ArrayList<Integer> sarasas1 = new ArrayList<>();
        sarasas1.addAll(Arrays.asList(2, 5, 1, 9, -999, 9879, 55, 26));
        System.out.println(sarasas1);
        Collections.sort(sarasas1);
        System.out.println(sarasas1);
    }
}
