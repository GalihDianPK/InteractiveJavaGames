import java.util.Scanner;
public class projek_1 {

    public static void delay() {  //? ini fungsi delay
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void inputNama(Scanner input) { //? fungsi untuk input data diri
        String namaUser = "galih";
        byte attempts = 3;
        
        while(attempts > 0){
            System.out.print("Masukkan nama anda: ");
            String nama = input.nextLine(); //! ini dipakai sebagai parameter di main
            if (nama.equals(namaUser)){
                for(int i = 0; i < 3; i++){
                    System.out.print(".");
                    delay();
                }
                System.out.println("\nHai " + nama + "! Selamat datang!");
                return;
            } else {
                for(int i = 0; i < 3; i++){
                    System.out.print(".");
                    delay();
                }
                attempts--;
                System.out.println("\nKamu bukan pemilik server ini, " + attempts + " percobaan tersisa");
            }
        }
        System.out.println("Akses Ditolak!");
        System.exit(0);
    }

    public static byte menuAwal(Scanner input) { //? fungsi menu awal atau memilih game
        System.out.println("SELAMAT DATANG DI GAME!");
        String[] arrayGame = {"Tebak nilai", "Kalkulator", "SiSTEM KASIR MINI", "Multiple Choice", "Sistem Kasir"};

        for (int i = 0; i < arrayGame.length; i++){
            System.out.println((i + 1) + ". " + arrayGame[i]);
        }

        System.out.println("\nPilih Game 1-5 untuk melanjutkan.");
        byte pilihanGame = input.nextByte(); //! dipakai untuk parameter input di main
        delay();
        return pilihanGame;
    }
    
    public static void eksekusiPilihan(byte pilihanGame, Scanner input) {
        String[] arrayGame = {"Tebak nilai", "Kalkulator", "SISTEM KASIR MINI", "Multiple Choice", "Sistem Kasir"};
        switch (pilihanGame) {
            case 1: 
                System.out.println("\nSelamat datang di game " + arrayGame[0]);

                byte attempts = 3;

                while(attempts > 0){
                    byte angkaAcak = (byte) (Math.random() * 5 + 1); //? untuk menghasilkan angka acak
                    System.out.println("Silahkan tebak angka dari 1 - 5");

                    byte angka = input.nextByte(); //! parameter yang dipakai di main

                    if (angkaAcak != angka){
                        attempts--;
                        System.out.println("Angka yang kamu masukkan salah, percobaan tersisa " + attempts + " lagi!");
                    } else {
                        System.out.println("Hore jawaban kamu benar!");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");

            case 2 :
                System.out.println("Selamat datang di " + arrayGame[1]);

                System.out.print("Masukkan angka pertama : ");
                byte angkaPertama = input.nextByte();

                System.out.print("Masukkan angka kedua : ");
                byte angkaKedua = input.nextByte();

                System.out.print("Masukkan Operator +,-,/,* : ");
                char operator = input.next().charAt(0); //? untuk mengambil 1 karakter

                double hasil = 0;

                switch(operator) {
                    case ('+') :
                       hasil = angkaPertama + angkaKedua;
                       System.out.println("hasilnya adalah " + hasil);
                       break;
                    case ('-') :
                        hasil = angkaPertama - angkaKedua;
                        System.out.println("hasilnya adalah " + hasil);
                        break;
                    case ('/') :
                        hasil = angkaPertama / angkaKedua;
                        System.out.println("hasilnya adalah " + hasil);
                        break;
                    case ('*') :
                        hasil = angkaPertama * angkaKedua;
                        System.out.println("hasiflnya adalah " + hasil);
                        break;
                    default : 
                    System.out.println("pilihan tidak tersedia");
                }
            case 3 :
                System.out.println("=== SISTEM KASIR MINI ===");
                
                String[] arrayMenu = {"Tambah barang", "Lihat Daftar belanja", "Hitung total", "Keluar"};
                for (int i = 0; i < arrayMenu.length; i++){
                    System.out.println((i + 1) + ". " + arrayMenu[i]);
                }

                System.out.print("Masukkan pilihan : ");
                byte pilihanMenu = input.nextByte();
                input.nextLine();

                switch(pilihanMenu){
                    case 1 :
                        System.out.print("Barang : ");
                        String barang = input.nextLine();

                        System.out.print("Harga : ");
                        int harga = input.nextInt();

                        System.out.print("Jumlah : ");
                        byte jumlah = input.nextByte();

                        int sistemOperasi = harga * jumlah;

                        System.out.println("total : Rp." + sistemOperasi);
                        break;           
                    default:
                        System.out.println("pilihan tidak tersedia");     
                        input.close();
                    }
                }
            }   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //? ini berfungsi agar input tetap bekerja di fungsi utama
        inputNama(input); //? memanggil fungsi data diri
        byte pilihan = menuAwal(input); //? memamnggil fungsi menuAwal
        eksekusiPilihan(pilihan, input); //? memanggil fungsi eksekusiPilihan
        input.close(); //? untuk menutup scanner
    }
}
