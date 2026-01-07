import java.util.ArrayList;
import java.util.Scanner;

public class Main { //bisa diakses di mana saja
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    static ArrayList<Dosen> daftarDosen = new ArrayList<>();
    static ArrayList<MataKuliah> daftarMK = new ArrayList<>();
    static ArrayList<Nilai> daftarNilai = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("=== SISTEM AKADEMIK ===");
            System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.totalMahasiswa); //Static var usage
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Semua Data & Nilai");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    inputMahasiswa();
                    break;
                case 2:
                    inputDosen();
                    break;
                case 3:
                    inputMataKuliah();
                    break;
                case 4:
                    inputNilai();
                    break;
                case 5:
                    tampilkanData();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    // 5.2 Method Void
    private static void inputMahasiswa() { 
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine(); //variable local
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Prodi: ");
        String prodi = scanner.nextLine();

        Mahasiswa mhs = new Mahasiswa(npm, nama, prodi);
        daftarMahasiswa.add(mhs);
        System.out.println("Data mahasiswa berhasil disimpan!");
    }

    private static void inputDosen() {
        System.out.print("Masukkan NIDN: ");
        String nidn = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Mata Kuliah Ampu: ");
        String ampu = scanner.nextLine();

        Dosen dosen = new Dosen(nidn, nama, ampu);
        daftarDosen.add(dosen);
        System.out.println("Data dosen berhasil disimpan!");
    }

    private static void inputMataKuliah() {
        System.out.print("Kode MK: ");
        String kode = scanner.nextLine();
        System.out.print("Nama MK: ");
        String nama = scanner.nextLine();
        System.out.print("SKS (angka): ");
        int sks = scanner.nextInt();
        
        MataKuliah mk = new MataKuliah(kode, nama, sks); //Menggunakan Overloading dari Matkul
        daftarMK.add(mk);
        System.out.println("Mata Kuliah berhasil disimpan!");
    }

    private static void inputNilai() {
        if (daftarMahasiswa.isEmpty() || daftarMK.isEmpty()) {
            System.out.println("Error: Data Mahasiswa atau Matkul belum ada.");
            return;
        }

        // Mahasiswa pertama & matkul pertama untuk contoh
        // nyatanya, harusnya ada pencarian data dulu.
        System.out.println("Menginput nilai untuk: " + daftarMahasiswa.get(0).getNama());
        System.out.println("Pada Matkul: " + daftarMK.get(0).getNamaMK());
        
        System.out.print("Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas = scanner.nextDouble();

        Nilai nilai = new Nilai(daftarMahasiswa.get(0), daftarMK.get(0), tugas, uts, uas);
        daftarNilai.add(nilai);
        System.out.println("Nilai berhasil diinput!");
    }

    private static void tampilkanData() {
        System.out.println("--- POLYMORPHISM & DATA USER ---");
        
        // Menampilkan Mahasiswa sebagai User
        for (User u : daftarMahasiswa) { //Polymorphism u
            u.tampilInfo(); // override dari Mahasiswa
        }

        // Menampilkan Dosen sebagai User
        for (User u : daftarDosen) { //Polymorphism u
            u.tampilInfo(); // override dari class Dosen
        }

        System.out.println("--- DATA NILAI AKHIR (INTERFACE) ---");
        for (Nilai n : daftarNilai) {
            n.tampilHasil();
        }
    }
}