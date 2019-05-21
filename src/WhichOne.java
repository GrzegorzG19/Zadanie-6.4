public class WhichOne {

    public void cwiartka(int tab1, int tab2) {
        int[] tab = new int[2];
        tab[0] = tab1;
        tab[1] = tab2;
        if (tab[0] > 0 && tab[1] > 0) {
            System.out.printf("punkt %d %d jest ćwiartce I", tab[0], tab[1]);
        } else if (tab[0] < 0 && tab[1] > 0) {
            System.out.printf("punkt %d %d jest ćwiartce II", tab[0], tab[1]);
        } else if (tab[0] < 0 && tab[1] < 0) {
            System.out.printf("punkt %d %d jest ćwiartce III", tab[0], tab[1]);
        } else if (tab[0] > 0 && tab[1] < 0) {
            System.out.printf("punkt %d %d jest ćwiartce IV", tab[0], tab[1]);
        }

    }
}
