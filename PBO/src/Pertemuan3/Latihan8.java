package Pertemuan3;

import java.util.Scanner;

public class Latihan8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Siapkah presiden pertama indonesia ?");
        System.out.println("a. Ir. Soekarno");
        System.out.println("b. B.J. Habibie");
        System.out.println("c. Megawati Soekarno Putri");
        System.out.println("d. Ahmad Roihan Nugraha");
        char pilih = scan.next().charAt(0);
        switch(pilih){
            case 'a':
                System.out.println("Benar!");
                break;
            case 'b':
                System.out.println("Salah, jawabannya adalah Ir. Soekarno");
                break;
            case 'c':
                System.out.println("Salah, jawabannya adalah Ir. Soekarno");
                break;
            case 'd':
                System.out.println("Salah, jawabannya adalah Ir. Soekarno");
                break;
            default:
                System.out.println("Sistem Error");
        }
    }
}
