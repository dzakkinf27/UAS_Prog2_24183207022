public class Dosen extends User { //object
    private String mataKuliahAmpu;

    public Dosen(String id, String nama, String mataKuliahAmpu) {
        super(id, nama);
        this.mataKuliahAmpu = mataKuliahAmpu;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Data Dosen ===");
        // KARENA PROTECTED: Akses langsung
        System.out.println("NIDN  : " + this.id);
        System.out.println("Nama  : " + this.nama);
        System.out.println("Ampu  : " + this.mataKuliahAmpu);
    }
}