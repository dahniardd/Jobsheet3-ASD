import java.util.Scanner;
public class PersegiPanjangDemo06 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah persegi panjang: ");
    int jumlah = sc.nextInt();
    PersegiPanjang06[] arrayOfPersegiPanjang = new PersegiPanjang06[jumlah];

    for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
        arrayOfPersegiPanjang[i] = new PersegiPanjang06();
        System.out.println("Persegi panjang ke-"+(i+1));
        System.out.print("Masukkan panjang: ");
        arrayOfPersegiPanjang[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        arrayOfPersegiPanjang[i].lebar = sc.nextInt();
}
    for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
    System.out.println("Persegi panjang ke-"+(i+1)+", panjang: "+
    arrayOfPersegiPanjang[i].panjang+ ", lebar: " +arrayOfPersegiPanjang[i].lebar);
    }
    }
}