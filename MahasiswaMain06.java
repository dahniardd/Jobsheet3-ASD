import java.util.Scanner;
public class MahasiswaMain06 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        Mahasiswa06[] daftarMahasiswa = new Mahasiswa06[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            daftarMahasiswa[i] = new Mahasiswa06();
            System.out.println("Mahasiswa ke-"+ (i+1));
            System.out.print("Masukkan nama: ");
            daftarMahasiswa[i].nama = sc.next();
            System.out.print("Masukkan NIM: ");
            daftarMahasiswa[i].nim = sc.next();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            daftarMahasiswa[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            daftarMahasiswa[i].ipk = sc.nextDouble();
        }
            double rataRataIPK = 0;
        
            for (Mahasiswa06 mhs : daftarMahasiswa) {
            rataRataIPK += mhs.ipk;
        }
            rataRataIPK /= jumlahMahasiswa;
            System.out.println("\nInformasi Mahasiswa");
        
            for (Mahasiswa06 mhs : daftarMahasiswa) {
            System.out.println("Nama: " + mhs.nama);
            System.out.println("NIM: " + mhs.nim);
            System.out.println("Jenis Kelamin: " + mhs.jenisKelamin);
            System.out.println("IPK: " + mhs.ipk);
            System.out.println();
        }
            System.out.println("Rata-rata IPK: " + rataRataIPK);
        }
    }
    

