import java.util.Scanner;
public class latihan {
    public static void main (String[] args) {

        byte kkmBahasa = 75, kkmMatematika = 70, kkmInggris = 75;

        Scanner input  = new Scanner (System.in);
        String[] pelajaran = ["Bahasa", "Matematika", "Inggris"];
        int[] nilai = new int[3]; //! untuk menyimpan nilai inputnya

        System.out.print("Input nama Siswa : ");
        String siswa = input.next();

        for (int i = 0; i < 3)
        System.out.print("Masukkan nilai Bahasa : ");
        byte nilaiSiswa = input.nextInt();

        if (nilaiSiswa < kkmBahasa){
            System.out.print("REMEDIAL");
        } else {
            System.out.print("LULUS");
        }
    } 
}