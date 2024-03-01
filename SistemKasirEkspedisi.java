import java.util.Scanner;
public class SistemKasirEkspedisi {
        public static void main(String[] args) {
            // Deklarasi variabel untuk data pengirim
            String namaPengirim = "Dahniar Davina";
            String alamatPengirim = "Jl. Merdeka No. 12, Malang";
            String nomorTeleponPengirim = "081234567890";
            String kotaPengirim = "Malang";
            String kodePosPengirim = "65141";
    
            // Deklarasi variabel untuk data barang
            String namaBarang = "Oven";
            float beratBarang = 2.5f;
            int panjangBarang = 30;
            int tinggiBarang = 20;
            int lebarBarang = 15;
            int jumlahBarang = 1;
            String jenisBarang = "Elektronik";
            float nilaiBarang = 500000.0f;
    
            // Cetak data pengirim
            System.out.println("Data Pengirim:");
            System.out.println("Nama: " + namaPengirim);
            System.out.println("Alamat: " + alamatPengirim);
            System.out.println("Nomor Telepon: " + nomorTeleponPengirim);
            System.out.println("Kota: " + kotaPengirim);
            System.out.println("Kode Pos: " + kodePosPengirim);
    
            // Cetak data barang
            System.out.println("\nData Barang:");
            System.out.println("Nama: " + namaBarang);
            System.out.println("Berat: " + beratBarang + " kg");
            System.out.println("Panjang: " + panjangBarang + " cm");
            System.out.println("Tinggi: " + tinggiBarang + " cm");
            System.out.println("Lebar: " + lebarBarang + " cm");
            System.out.println("Jumlah: " + jumlahBarang);
            System.out.println("Jenis: " + jenisBarang);
            System.out.println("Nilai: " + nilaiBarang);
    
            // Hitung total biaya pengiriman
            float totalBiaya = hitungTotalBiaya(beratBarang, jenisBarang);
    
            // Cetak total biaya pengiriman
            System.out.println("\nTotal Biaya Pengiriman: Rp" + totalBiaya);
        }
    
        private static float hitungTotalBiaya(float beratBarang, String jenisBarang) {
            float biayaPerKg = 5000.0f;
            float biayaTambahanElektronik = 10000.0f;
    
            if (jenisBarang.equalsIgnoreCase("Elektronik")) {
                return biayaPerKg * beratBarang + biayaTambahanElektronik;
            } else {
                return biayaPerKg * beratBarang;
            }
        }
 }
    

