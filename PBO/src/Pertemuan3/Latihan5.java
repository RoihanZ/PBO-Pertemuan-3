package Pertemuan3;

public class Latihan5 {

    public static void main(String[] args) {
        double nilai = 92.0;
        if(nilai >= 90){
            System.out.println("Luar Biasa");
        }else if((nilai < 90) && (nilai >= 80)){
            System.out.println("Kerja Bagus");
        }else if((nilai < 80) && (nilai >= 60)){
            System.out.println("Belajar lebih giat lagi");
        }else{
            System.out.println("Maaf, Anda gagal.");
        }
    }
}
