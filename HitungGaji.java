import java.util.Scanner;

class Karyawan {
    String id, nama, shift;
    int jamKerja, hariAbsen;
    
    public Karyawan(String idKaryawan, String namaKaryawan, String shiftKerja, int totalJamKerja, int jumlahHariAbsen) {
        id = idKaryawan;
        nama = namaKaryawan;
        shift = shiftKerja;
        jamKerja = totalJamKerja;
        hariAbsen = jumlahHariAbsen;
    }
    
    public double hitungGaji() {
        double tarifPerJam;
        switch (shift.toLowerCase()) {
            case "pagi": tarifPerJam = 50000; break;
            case "siang": tarifPerJam = 60000; break;
            case "malam": tarifPerJam = 75000; break;
            default: tarifPerJam = 0; break;
        }
        
        double gaji = jamKerja * tarifPerJam;
        
        if (jamKerja > 40) {
            int lembur = jamKerja - 40;
            double tambahanLembur = lembur * (tarifPerJam * 1.5);
            gaji = gaji + tambahanLembur;
        }
        
        if (jamKerja < 30) {
            double potongan = gaji * 0.1;
            gaji = gaji - potongan;
        }
        
        double potonganAbsen = hariAbsen * 100000;
        gaji = gaji - potonganAbsen;
        
        return gaji;
    }
    
    public void tampilkanGaji() {
        System.out.println("====================================");
        System.out.println("ID Karyawan  : " + id);
        System.out.println("Nama         : " + nama);
        System.out.println("Shift Kerja  : " + shift);
        System.out.println("Jam Kerja    : " + jamKerja + " jam");
        System.out.println("Hari Absen   : " + hariAbsen + " hari");
        System.out.println("Total Gaji   : Rp " + String.format("%,.2f", hitungGaji()));
        System.out.println("====================================");
    }
}

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();
        input.nextLine();
        
        Karyawan[] karyawanList = new Karyawan[jumlahKaryawan];
        
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nMasukkan data karyawan ke-" + (i + 1));
            System.out.print("ID Karyawan: ");
            String id = input.nextLine();
            System.out.print("Nama Karyawan: ");
            String nama = input.nextLine();
            System.out.print("Shift Kerja (pagi/siang/malam): ");
            String shift = input.nextLine();
            System.out.print("Total Jam Kerja dalam seminggu: ");
            int jamKerja = input.nextInt();
            System.out.print("Jumlah Hari Absen: ");
            int hariAbsen = input.nextInt();
            input.nextLine();
            
            karyawanList[i] = new Karyawan(id, nama, shift, jamKerja, hariAbsen);
        }
        
        System.out.println("\nLaporan Gaji Karyawan:");
        for (int i = 0; i < jumlahKaryawan; i++) {
            karyawanList[i].tampilkanGaji();
        }
        
        input.close();
    }
}
