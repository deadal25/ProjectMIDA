public class NilaiPraktikum extends Nilai {
    private int nilaiPraktikum;

    public NilaiPraktikum(MataKuliah mataKuliah, int nilaiTugas, int nilaiPraktikum) {
        super(mataKuliah, nilaiTugas);
        this.nilaiPraktikum = nilaiPraktikum;
    }

    public int getNilaiPraktikum() {
        return nilaiPraktikum;
    }

    public void setNilaiPraktikum(int nilaiPraktikum) {
        this.nilaiPraktikum = nilaiPraktikum;
    }

    public void showDetail() {
        System.out.println("Nilai Praktikum ");
        super.showDetail();
        System.out.println("Nilai Ujian Praktikum : " + nilaiPraktikum);

    }

}