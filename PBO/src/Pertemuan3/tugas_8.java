package Pertemuan3;

import java.util.Scanner;

public class tugas_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Masukkan Panjang Angka Ganjil : ");
        int jawab = scan.nextInt();
        System.out.println("Hasil");
        for(int i = 1; i < jawab * 2; i += 2){
                System.out.println(i);
            }
            
        }
}
