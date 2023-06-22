public class MataKuliah {
    private String KodeMatkul;
    private String namaMatkul;
    private int sks;

    public MataKuliah() {
    }

    public void setKodeMatkul(String kodeMatkul) {
        KodeMatkul = kodeMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getKodeMatkul() {
        return KodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

}
