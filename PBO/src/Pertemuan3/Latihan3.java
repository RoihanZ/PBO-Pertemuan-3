package Pertemuan3;

import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Apakah anda mahasiswa Poliban ? (Y jika setuju) ");
        String jawaban = scan.next();
        if("Y".equals(jawaban)){
            System.out.println("Selamat berjuang di Poliban");
        }else{
            System.out.println("Selamat datang di Poliban");
        }
    }
}
