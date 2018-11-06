import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uzduotis_10b {

    //Turime sąrašą: [2, 5, 1, 9, -999, 9879, 55, 26] Parašyti metodą kuris grąžintų tokį patį
    //sarašą surikiuotą mažėjimo tvarka.
    //Collections.reverse(...) arba Collections.sort(..., Collections.reverseOrder());

    public static void main(String[] args) {
        ArrayList<Integer> sarasas1 = new ArrayList<>();
        sarasas1.addAll(Arrays.asList(2, 5, 1, 9, -999, 9879, 55, 26));
        System.out.println(sarasas1);
        Collections.sort(sarasas1);
        Collections.reverse(sarasas1);
//        Collections.sort(sarasas1,Collections.reverseOrder());
        System.out.println(sarasas1);
    }
}
