import java.util.Scanner;

public class postTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        double totalBelanja = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Masukkan tipe member (Platinum/Gold/Silver/Tidak ada): ");
        String member = scanner.nextLine();

        double diskonUtama = 0;
        if (totalBelanja > 500000) {
            diskonUtama = 0.20;
        } else if (totalBelanja >= 250000) {
            diskonUtama = 0.10;
        }

        double hargaSetelahDiskonUtama = totalBelanja - (totalBelanja * diskonUtama);

        double diskonTambahan = 0;
        switch (member.toLowerCase()) {
            case "platinum":
                diskonTambahan = 0.05;
                break;
            case "gold":
                diskonTambahan = 0.03;
                break;
            case "silver":
                diskonTambahan = 0.02;
                break;
            default:
                diskonTambahan = 0;
                break;
        }

        double totalDiskonTambahan = hargaSetelahDiskonUtama * diskonTambahan;
        double totalHargaAkhir = hargaSetelahDiskonUtama - totalDiskonTambahan;

        String statusDiskon = (diskonUtama > 0 || diskonTambahan > 0) ? "Anda mendapatkan diskon!" : "Tidak ada diskon.";

        System.out.println("\nTotal belanja awal: Rp" + totalBelanja);
        System.out.println("Diskon utama: " + (diskonUtama * 100) + "%");
        System.out.println("Harga setelah diskon utama: Rp" + hargaSetelahDiskonUtama);
        System.out.println("Diskon tambahan untuk member " + member + ": " + (diskonTambahan * 100) + "%");
        System.out.println("Total harga akhir setelah semua diskon: Rp" + totalHargaAkhir);
        System.out.println(statusDiskon);

        scanner.close();
    }
}
