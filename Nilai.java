public class Nilai implements Penilaian {
    private Mahasiswa mahasiswa;
    private MataKuliah mataKuliah;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUts = uts;
        this.nilaiUas = uas;
    }

    //Interface
    @Override
    public double hitungNilaiAkhir() {
        // Rumus contoh: 30% Tugas + 35% UTS + 35% UAS
        return (nilaiTugas * 0.3) + (nilaiUts * 0.35) + (nilaiUas * 0.35);
    }

    // 5.2 Method Void
    public void tampilHasil() {
        System.out.println("--------------------------------");
        System.out.println("Mahasiswa : " + mahasiswa.getNama());
        System.out.println("Matkul    : " + mataKuliah.getNamaMK());
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
}