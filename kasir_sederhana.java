import java.util.Scanner;
import java.util.ArrayList; //? untuk memasukkan ke dalam array
public class kasir_sederhana {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
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

                ArrayList<String> daftarBarang = new ArrayList<>();
                ArrayList<Integer> daftarHarga = new ArrayList<>();
                ArrayList<Byte> daftarJumlah = new ArrayList<>();

                daftarBarang.add(barang); //? untuk mendorong daftarBarang ke barang
                daftarHarga.add(harga);
                daftarJumlah.add(jumlah);

                int sistemOperasi = harga * jumlah;

                System.out.println("total : Rp." + sistemOperasi);
                break;           
            default:
                System.out.println("pilihan tidak tersedia");     
                input.close();

            case 2 :
                System.out.println(daftarBarang);
                break;
        }
    }
}

