import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * TODO 1
         * Instance Objek Mahasiswa
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Adrian Hidayat");
        mahasiswa.getNama();
        mahasiswa.setNim("H071221091");
        mahasiswa.getNim();
        /*
         * TODO 2
         * Instance Objek MataKuliah
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        MataKuliah mataKuliah = new MataKuliah();
        mataKuliah.setKodeMatkul("qwe789");
        mataKuliah.getKodeMatkul();
        mataKuliah.setNamaMatkul("Teknologi Jaringan dan Web");
        mataKuliah.getNamaMatkul();
        mataKuliah.setSks(280);
        mataKuliah.getSks();
        /*
         * TODO 3
         * Instance Objek NilaiPraktikum
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        NilaiPraktikum nilaiPraktikum = new NilaiPraktikum(mataKuliah, 78, 100);
        /*
         * TODO 4
         * Instance Objek NilaiKelas
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        NilaiKelas nilaiKelas = new NilaiKelas(mataKuliah, 80, 90);
        /*
         * TODO 5
         * Kirimkan objek mahasiswa, nilaiKelas dan nilaiPraktikum
         * ke method runApp
         */

        runApp(mahasiswa, nilaiKelas, nilaiPraktikum);
        // runApp();
    }

    public static void runApp(Mahasiswa mahasiswa, NilaiKelas nilaiKelas, NilaiPraktikum nilaiPraktikum) {
        /*
         * TODO 6
         * Tampilkan data mahasiwa dan matakuliah seperti contoh berikut :
         * Nilai Matkul - OOP
         * Ikhsan(H071191049)
         */
        mahasiswa.showDetail();
        // System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show Nilai Praktikum");
        System.out.println("2. Show Nilai Kelas");
        System.out.println("3. Show Feedback");
        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                // TODO 7 : Tampilkan Detail Nilai Praktikum
                nilaiPraktikum.showDetail();
                break;
            case 2:
                System.out.println("-".repeat(25));
                // TODO 8 : Tampilkan Detail Nilai Kelas
                nilaiKelas.showDetail();
                break;
            case 3:
                System.out.println("=".repeat(25));
                HelperMid.showMyData();
                // TODO 9 : Tampilkan Data Diri (showMyData)
                // TODO 10 : Tampilkan Kritik dan Saran
                System.out.println("=".repeat(25));
                HelperMid.showFeedbackLab();
                System.out.println("=".repeat(25));
                HelperMid.cutLineString();
                break;
            default:
                break;
        }
        scanner.close();

    };
}
