package pl.akademia108;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Wprowadź swój wiek: ");
        Scanner scan = new Scanner(System.in);

        Integer wiek = Integer.valueOf(scan.next());

        boolean parzysta = false;
        if (wiek % 2 == 0) {
            parzysta = true;
        }

        boolean wiekWZakresie20do40 = false;
        if ((wiek > 20) && (wiek < 40)) {
            wiekWZakresie20do40 = true;
        }

        boolean rowny25lub35 = false;
        if ((wiek == 25) || (wiek == 35)) {
            rowny25lub35 = true;
        }

        System.out.println("Wiek jest liczą parzystą? " + parzysta);
        System.out.println("Wiek jest w zakresie os 20 do 40 lat? " + wiekWZakresie20do40);
        System.out.println("Wiek jest równy 25 lub 35 lat? " + rowny25lub35);

    }
}
