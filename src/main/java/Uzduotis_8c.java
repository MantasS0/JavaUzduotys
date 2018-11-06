public class Uzduotis_8c {
    public static void main(String[] args) {
        //Parašyti metodą kuris per parametrus pasiimtų masyvą, o grąžintų apsuktą masyvą ([1,
        //2, 3, 4, 5] -> [5, 4, 3, 2, 1]). Užuomina: sukurti antrą tokio paties dydžio masyvą ir jam priskirti
        //skaičius nuo galo.

        int[] mas1 = {1, 5, 8, 7, 66, 8, 43, 58, 4, 68, 9, 1, 91, 80, 35, 48};

        System.out.println("Masyvo Nr. 1 skaiciai:");
        for (int sk1 : mas1) {
            System.out.println(sk1);
        }
        System.out.println("Masyvo Nr. 2 skaiciai:");
        for (int sk2 : MasyvasInvert(mas1)) {
            System.out.println(sk2);
        }
    }

    public static int[] MasyvasInvert(int[] mas1) {
        int[] mas2 = new int[mas1.length];
        for (int i = 0; i < mas1.length; i++) {
            mas2[mas2.length - 1 - i] = mas1[i];
        }
        return mas2;
    }
}
