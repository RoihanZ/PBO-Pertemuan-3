package Pertemuan3;

import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        String jawaban, jawaban1;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Apakah anda mahasiswa ? (iya) ");
        jawaban = scan.next();
        if(("iya".equals(jawaban) || "IYA".equals(jawaban))){
            System.out.print("Apakah anda selalu terlambat masuk kelas ? ");
            jawaban1 = scan.next();
            if(("tidak".equals(jawaban1) || "TIDAK".equals(jawaban1))){
                System.out.println("Bagus, Pertahankan");
            }
        }
    }
}
