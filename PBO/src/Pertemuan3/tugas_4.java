package Pertemuan3;

import java.util.Scanner;

public class tugas_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int angka;
        System.out.println("Nama Bulan berdasarkan angka 1 - 12");
        System.out.print("Masukkan angka 1 - 12 = ");
        angka = scan.nextInt();
        if(angka >= 1 && angka <= 12){
            if (angka == 1) {
                System.out.println("Januari");
            }else if(angka == 2){
                System.out.println("Februari");
            }
            else if(angka == 3){
                System.out.println("Maret");
            }
            else if(angka == 4){
                System.out.println("April");
            }
            else if(angka == 5){
                System.out.println("Mei");
            }
            else if(angka == 6){
                System.out.println("Juni");
            }
            else if(angka == 7){
                System.out.println("Juli");
            }
            else if(angka == 8){
                System.out.println("Agustus");
            }
            else if(angka == 9){
                System.out.println("September");
            }
            else if(angka == 10){
                System.out.println("Oktober");
            }
            else if(angka == 11){
                System.out.println("November");
            }
            else if(angka == 12){
                System.out.println("Desember");
            }else{
                System.out.println("Error");
            }
        }else{
            System.out.println("Tidak ada nama bulan untuk angka tersebut.");
        }
    }
}
