package kalkulator;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        String garis = "===========================";
        String judul = " KALKULATOR ";
        int a, b, c, d, e, f;

        // buat objek input
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("masukan nilai 1 : ");
        a = input.nextInt();
        System.out.print("masukan nilai 2 : ");
        b = input.nextInt();

        // rumus
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;

        // output
        System.out.println(garis);
        System.out.println(judul);
        System.out.println(garis);
        System.out.println("Nilai 1 : " + a);
        System.out.println("Nilai 2 : " + b);
        System.out.println("Hasil Penjumlahan : " + c);
        System.out.println("Hasil Pengurangan : " + d);
        System.out.println("Hasil Perkalian : " + e);
        System.out.println("Hasil Pembagian : " + f);
        System.out.println(garis);
    }
}

