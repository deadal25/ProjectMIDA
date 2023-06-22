public class NilaiKelas extends Nilai {
    private int nilaiUjian;

    public NilaiKelas(MataKuliah mataKuliah, int nilaiTugas, int nilaiUjian) {
        super(mataKuliah, nilaiTugas);
        this.nilaiUjian = nilaiUjian;
    }

    public void setNilaiUjian(int nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }

    public int getNilaiUjian() {
        return nilaiUjian;
    }

    public void showDetail() {
        System.out.println("Nilai Kelas ");
        super.showDetail();
        System.out.println("Nilai Final : " + nilaiUjian);

    }

}