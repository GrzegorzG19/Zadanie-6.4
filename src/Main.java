import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[2];

        
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj x");
        tab[0] = scan.nextInt();
        System.out.println("Podaj y");
        tab[1] = scan.nextInt();

        WhichOne one = new WhichOne();

        one.cwiartka(tab[0], tab[1]);


    }
}
