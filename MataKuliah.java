public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;

    public MataKuliah(String kodeMK, String namaMK) { //constructor overlod 1
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = 2; // Default SKS
    }
    
    public MataKuliah(String kodeMK, String namaMK, int sks) { //constructor overlod 2
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public String getNamaMK() {
        return namaMK;
    }
    
    public void tampilInfo() {
        System.out.println(kodeMK + " - " + namaMK + " (" + sks + " SKS)");
    }
}