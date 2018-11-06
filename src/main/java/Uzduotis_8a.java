public class Uzduotis_8a {
    public static void main(String[] args) {
        //Parašyti metodą kurio parametras būtų sveikų skaičių masyvas. Metodas turi grąžinti
        //didžiausią masyvo skaičių.
        int[] mas1 = {1, 5, 8, 7, 66, 8, 43, 58, 4, 68, 9, 1, 91, 80, 35, 48};
        System.out.println("Didziausias skaicius masyve yra: " + MetodasMax(mas1));
    }

    public static int MetodasMax(int[] mas1) {

        int skmax = mas1[0];
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] > skmax) {
                skmax = mas1[i];
            }
        }
        return skmax;
    }
}
