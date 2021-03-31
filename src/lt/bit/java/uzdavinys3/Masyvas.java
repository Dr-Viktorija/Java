package lt.bit.java.uzdavinys3;

import java.util.Arrays;

public class Masyvas {
    public static void main(String[] args) {
        int[] masyvas = {-10, 0, 2, 9, -5};
        int pirmas = masyvas[0];
        int antras = masyvas[1];
        int trecias = masyvas[2];
        int ketvirtas = masyvas[3];
        int penktas = masyvas[4];
        int tuscias = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[1] > masyvas[0]) {
                tuscias = masyvas[0];
                masyvas[0] = masyvas[1];
                masyvas[1] = tuscias;
            }
            if (masyvas[2] > masyvas[1]) {
                tuscias = masyvas[1];
                masyvas[1] = masyvas[2];
                masyvas[2] = tuscias;
            }
            if (masyvas[3] > masyvas[2]) {
                tuscias = masyvas[2];
                masyvas[2] = masyvas[3];
                masyvas[3] = tuscias;
            }
            if (masyvas[4] > masyvas[3]) {
                tuscias = masyvas[3];
                masyvas[3] = masyvas[4];
                masyvas[4] = tuscias;
            }

        }
        System.out.println(Arrays.toString(masyvas));
    }

}
