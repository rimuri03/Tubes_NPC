/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.npctubes;

import java.util.Scanner;

/**
 *
 * @author RizkiMr
 */
public class Npctubes {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        
        int hasil1 = CariNilaiPangkat1(a, b);
        if (hasil1 == -1) {
            System.out.println("Nilai pangkat negatif tidak diperbolehkan.");
        } else if (hasil1 == -2) {
            System.out.println("Input melebihi batas yang diizinkan.");
        } else {
            System.out.println("Hasil pangkat dari " + a + "^" + b + " adalah: " + hasil1);
        }

        int hasil2 = CariNilaiPangkat2(a, b);
        if (hasil2 == -1) {
            System.out.println("Nilai pangkat negatif tidak diperbolehkan.");
        } else if (hasil2 == -2) {
            System.out.println("Input melebihi batas yang diizinkan.");
        } else {
            System.out.println("Hasil pangkat dari " + a + "^" + b + " adalah: " + hasil2);
        }

        int hasil3 = CariNilaiPangkat3(a, b);
        if (hasil3 == -1) {
            System.out.println("Nilai pangkat negatif tidak diperbolehkan.");
        } else if (hasil3 == -2) {
            System.out.println("Input melebihi batas yang diizinkan.");
        } else {
            System.out.println("Hasil pangkat dari " + a + "^" + b + " adalah: " + hasil3);
        }
        
        scanner.close();
    }

    public static int CariNilaiPangkat1(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return -1;
        } else if (b > 10 || a > 100) {
            return -2;
        } else {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
    }

    public static int CariNilaiPangkat2(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return -1;
        } else if (b > 10 || a > 100) {
            return -2;
        } else {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
    }

    public static int CariNilaiPangkat3(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return -1;
        } else if (b > 10 || a > 100) {
            return -2;
        } else {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
    }
}
