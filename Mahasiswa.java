public class Mahasiswa extends User { //object
    private String prodi; //variable //hanya bisa diakses class ini
    public static int totalMahasiswa = 0; //variable static

    public Mahasiswa() {
        super();
        totalMahasiswa++;
    }

    public Mahasiswa(String id, String nama, String prodi) {
        super(id, nama); 
        this.prodi = prodi;
        totalMahasiswa++;
    }

    public String getProdi() {
        return prodi;
    }

    @Override
    public void tampilInfo() { //mothod void
        System.out.println("=== Data Mahasiswa ===");
        // KARENA PROTECTED: Bisa akses 'id' dan 'nama' langsung (tanpa get)
        System.out.println("NPM   : " + this.id);   
        System.out.println("Nama  : " + this.nama); 
        System.out.println("Prodi : " + this.prodi);
    }
}