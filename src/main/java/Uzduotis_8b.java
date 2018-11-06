public class Uzduotis_8b {
    public static void main(String[] args) {
        int[] mas1 = {1, 5, 8, 7, 66, 8, 43, 58, 4, 68, 9, 1, 91, 80, 35, 48};
        System.out.println("Maziausias skaicius masyve yra: " + MetodasMin(mas1));

    }

    public static int MetodasMin(int[] mas1) {

        int skmin = mas1[0];
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] < skmin) {
                skmin = mas1[i];
            }
        }
        return skmin;

    }
}