package scanner;

import java.util.Scanner;

public class Soalkeempat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai i: ");
        int i = scan.nextInt();
        scan.nextLine();
        System.out.print("Masukkan nilai d: ");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.print("Masukkan nilai s: ");
        String s = scan.nextLine();

        scan.close();

        System.out.println("String " +s);
        System.out.println("Double " + d);
        System.out.println("Int " + i);
    }
}
