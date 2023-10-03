package Pertemuan3;

import java.util.Scanner;

public class tugas_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Masukkan Panjang Angka Genap : ");
        int jawab = scan.nextInt();
        System.out.println("Hasil");
        for(int i = 2; i < jawab * 2; i += 2){
                System.out.println(i);
            }
            
        }
}
