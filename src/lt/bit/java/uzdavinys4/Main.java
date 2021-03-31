package lt.bit.java.uzdavinys4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int masyvas[] = {5, 4, 29, -58, -2, 0, 1, 88, -2, 10, 4, 9};
        int k = 0;

        System.out.println(Arrays.toString(masyvas));

        for(int i = 0; i < masyvas.length; i++) {
            for(int j = i; j < masyvas.length; j++) {
                if(masyvas[i] < masyvas[j]) {
                    k = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = k;
                }
            }
        }

        System.out.println(Arrays.toString(masyvas));
    }
}
