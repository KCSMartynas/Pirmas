package lt.kaunascoding;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    //Parašyti programą, kuri paprašytų įvesti 5 skaičius.
    // Baigus skaičių įvedimą, turi būti atvaizduojama įvestų
    // skaičių suma ir visi įvesti skaičiai.
    public static final int MASYVO_ILGIS = 5;

    public static void main(String[] args) {
        System.out.println("Konichiwa, daizhobu des ka? Įveskite " + MASYVO_ILGIS + " skaičius, ir tt");
        Scanner sc = new Scanner(System.in);
        int[] skaiciai = new int[MASYVO_ILGIS];
        int suma = 0;
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciai[i] = sc.nextInt();
            suma += skaiciai[i];
        }
        System.out.println("Suma yra: " + suma);
        for (int i = 0; i < skaiciai.length; i++) {
            System.out.print(skaiciai[i] + " ");
        }
    }
}
