package lt.bit.java.uzdavinys2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        int i;
//
//        for (i = 1; i <= 10; i++) {
////            System.out.println(i );
//            int n;
//            for (n = 1; n <=10; n++) {
//                System.out.println(i + " x " + n + " = " + (i * n));
//            }
//            System.out.println();
//        }
//     for(int row = 1; row <= 10; row++) {
//         for (int col = 1; col <= 9; col++) {
//             System.out.print(col + " x " + row + " = " + col * row + "\t");
//         }
//         System.out.println();
//     }
//        for(int row = 1; row <= 10; row++) {
//            for (int col = 1; col <= 3; col++) {
//                System.out.print(col + " x " + row + " = " + col * row + "\t");
//            }
//            System.out.println();}
//        System.out.println();
//            for(int row = 1; row <= 10; row++) {
//                for (int col = 4; col <= 6; col++) {
//                    System.out.print(col + " x " + row + " = " + col * row + "\t");
//                }
//                System.out.println();
//            }
//        System.out.println();
//            for(int row = 1; row <= 10; row++) {
//        for (int col = 7; col <= 9; col++) {
//            System.out.print(col + " x " + row + " = " + col * row + "\t");
//        }
//        System.out.println();
//    }

        for(int i = 0; i < 3; i++) {
            for (int row = 1; row <= 10; row++) {
                for(int col = i * 3 + 1; col <= i * 3 + 1 + 2; col++) {
                    System.out.print(col + " x " + row + " = " + col * row + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        }
    }

