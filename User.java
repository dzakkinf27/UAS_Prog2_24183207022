public abstract class User {
    protected String id;    //bisa diakses turunannya
    protected String nama;  //          ||

    public User() { //constructor 
    }

    public User(String id, String nama) { //constructor berparameter
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter TETAP PERLU ADA
    // Karena di Main.java (class luar), kita tidak bisa akses 'protected' secara langsung
    // jika nanti beda package. Dan juga untuk memenuhi poin 5.5 (Encapsulation).
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void tampilInfo();
}