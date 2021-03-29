package lt.bit.java.uzdavinys2;

public class Main {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 10; i++) {
//            System.out.println(i );
            int n;
            for (n = 1; n <=10; n++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
    }
}
