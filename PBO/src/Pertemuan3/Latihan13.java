package Pertemuan3;

import java.util.Scanner;

public class Latihan13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int i = 10, angka;
        System.out.print("Masukkan Angka : ");
        angka = scan.nextInt();
        while (i >= angka){
            System.out.println(" Belajar Java " + i);
            i--;
        }
    }
}
