package Pertemuan3;

import java.util.Scanner;

public class tugas_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int jumlah_user;
        int nilai = 0;
        int hasil;
        System.out.print("Tentukan berapa pengguna yang diinginkan : ");
        jumlah_user = scan.nextInt();
        
        int sum = 0;
        
        for(int i = 1; i <= jumlah_user; i++){
            System.out.print("Nilai user ke - " + i + " = ");
            nilai = scan.nextInt();
            
            sum += nilai;
        }
        hasil = sum / jumlah_user;
        if(hasil >= 80 && hasil <= 100){
            System.out.println("Lulus");
        }else if(hasil < 80){
            System.out.println("Sayang sekali Anda tidak lulus");
        }
    }
}
