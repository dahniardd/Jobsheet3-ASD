public class PersegiPanjang06 {
    public int panjang;
    public int lebar;

    public void cetakInfo() {
    }
    public PersegiPanjang06(int p, int l) {
        panjang = p;
        lebar = l;
    }
    public PersegiPanjang06() {
        //TODO Auto-generated constructor stub
    }
    public int hitungLuas() {
        return panjang*lebar;
    }
    public int hitungKeliling() {
        return 2*(panjang*lebar);
    } 
}
