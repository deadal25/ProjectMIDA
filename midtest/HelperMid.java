public class HelperMid {
    public static void showMyData() {
        System.out.println("====================");
        System.out.println("DATA DIRI");
        System.out.println("NAMA : ADRIAN HIDAYAT");
        System.out.println("NIM  : H071221091");
        System.out.println("KELAS : A");
        System.out.println("PAKET : A");
    }

    public static void showFeedbackLab() {
        System.out.println("Sudah ku revisi kak");
        System.out.println("Evan Pandu dengan NIM H071221057");

    }

    public static void cutLineString() {
        String kalimat = "halo system informasi 2022 unhas";
        String[] kalimat_pisah = kalimat.split(" ");
        for (int i = 0; i < kalimat_pisah.length; i++) {
            System.out.print(kalimat_pisah[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
