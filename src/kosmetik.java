import java.util.Scanner;

public class kosmetik {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan data kosmetik
        String[] namaKosmetik = new String[10];
        double[] hargaKosmetik = new double[10];
        int[] jumlahTerjual = new int[10];

        // Mengisi data kosmetik
        isiDataKosmetik(namaKosmetik, hargaKosmetik);

        // Input penjualan
        inputPenjualan(namaKosmetik, jumlahTerjual);

        // Menampilkan total penjualan dan pendapatan
        tampilkanPenjualan(namaKosmetik, hargaKosmetik, jumlahTerjual);
    }

    // Metode untuk mengisi data kosmetik
    private static void isiDataKosmetik(String[] namaKosmetik, double[] hargaKosmetik) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data kosmetik:");
        for (int i = 0; i < namaKosmetik.length; i++) {
            System.out.print("Nama kosmetik ke-" + (i + 1) + ": ");
            namaKosmetik[i] = scanner.nextLine();

            System.out.print("Harga kosmetik ke-" + (i + 1) + ": ");
            hargaKosmetik[i] = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer newline
        }
    }

    // Metode untuk input penjualan
    private static void inputPenjualan(String[] namaKosmetik, int[] jumlahTerjual) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMasukkan data penjualan:");

        for (int i = 0; i < namaKosmetik.length; i++) {
            System.out.print("Jumlah " + namaKosmetik[i] + " terjual: ");
            jumlahTerjual[i] = scanner.nextInt();
        }
    }

    // Metode untuk menampilkan total penjualan dan pendapatan
    private static void tampilkanPenjualan(String[] namaKosmetik, double[] hargaKosmetik, int[] jumlahTerjual) {
        System.out.println("\nLaporan Penjualan:");

        double totalPendapatan = 0;

        for (int i = 0; i < namaKosmetik.length; i++) {
            double pendapatanProduk = hargaKosmetik[i] * jumlahTerjual[i];
            totalPendapatan += pendapatanProduk;

            System.out.println(namaKosmetik[i] + ": " + jumlahTerjual[i] + " pcs - Rp" + pendapatanProduk);
        }

        System.out.println("\nTotal Pendapatan: Rp" + totalPendapatan);
    }
}
