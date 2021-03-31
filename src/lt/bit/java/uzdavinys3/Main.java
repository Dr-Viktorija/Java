package lt.bit.java.uzdavinys3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Iveskite tris skaicius: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        System.out.print(a + ", " + b + " ," + c + " ");
        if(a + b> c && b + c > a && a + c > b) {
            System.out.println(" yra trikampis");
        } else {
            System.out.println(" nera trikampis");
        }
    }
}
