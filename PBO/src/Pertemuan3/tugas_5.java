package Pertemuan3;

import java.util.Scanner;

public class tugas_5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int pilih = 0, s, hasil;
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.print("Pilihan : ");
        pilih = scan.nextInt();
        if(pilih == 1){
            System.out.print("Masukkan panjang sisi persegi : ");
            s = scan.nextInt();
            hasil = s * s;
            System.out.println("Luas Persegi adalah : " + hasil + " cm");
        }else if(pilih == 2){
            System.out.print("Masukkan panjang sisi persegi : ");
            s = scan.nextInt();
            hasil = s + s + s + s;
            System.out.println("Keliling Persegi adalah : " + hasil + " cm");
        }else{
            System.out.println("Sistem Error");
        }
    }
}
