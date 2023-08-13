package scanner;

import java.util.Scanner;

public class ScannerSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scan.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scan.nextInt();
        System.out.print("Masukkan nilai c: ");
        int c = scan.nextInt();

        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
