package Pertemuan3;

import java.util.Scanner;

public class Latihan6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan angka untuk dikonversikan ke huruf : ");
        int angka = scan.nextInt();
        if(angka > 85){
            System.out.println("Angka " + angka + " = A");
        }else if(angka > 60){
            System.out.println("Angka " + angka + " = B");
        }else if(angka > 35){
            System.out.println("Angka " + angka + " = C");
        }else if(angka > 15){
            System.out.println("Angka " + angka + " = D");
        }else{
            System.out.println("Angka " + angka + " = E");
        }
    }
}
