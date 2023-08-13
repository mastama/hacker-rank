package scanner;

import java.util.Scanner;

public class Soalketiga {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan nilai N: ");
        int N = scan.nextInt();
        if (N % 2 == 1 || (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scan.close();
    }
}
