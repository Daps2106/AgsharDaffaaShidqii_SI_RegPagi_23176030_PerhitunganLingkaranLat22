/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.percobaan1;

import java.util.Scanner;

/**
 * Nama     : Agshar Daffaa Shdiqii
 * NIM      : 23176030
 * Prodi    : Sistem Informasi
 */
public class PerhitunganLingkaranLat22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String d;
        double diameter, r,luas,keliling;
        Scanner inputan = new Scanner(System.in);
        System.out.println("===== Perhitungan Lingkaran ======");

        // validasi
        do {
            System.out.print("Masukan diameter lingkaran : ");
            d = inputan.nextLine();
            System.out.println((!d.matches("\\d+(\\.\\d+)?"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");
        } while (!d.matches("\\d+(\\.\\d+)?")); // jiks kondisi while true maka akan terus mengulangi

        diameter = Double.parseDouble(d);

        r = diameter / 2;
        System.out.println("===== Hasil Perhitungan Lingkaran ======");
        System.out.printf("Jari-jari Lingkaran\t= %.0f cm %n", r);
        luas = Math.PI * r * r;
        System.out.printf("Luas Lingkaran\t\t= %.2f cm %n", luas);
        keliling = 2 * Math.PI * r;
        System.out.printf("Keliling Lingkaran\t= %.2f cm %n", keliling);

    }

}