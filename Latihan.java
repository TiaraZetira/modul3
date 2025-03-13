import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        scanner.close();

        int jumlahVokal = 0;
        String vokal = "aiueoAIUEO";

        for (char c : kalimat.toCharArray()) {
            if (vokal.indexOf(c) != -1) {
                jumlahVokal++;
            }
        }

        switch (jumlahVokal % 2) {
            case 0:
                System.out.println("Jumlah vokal genap: " + jumlahVokal);
                break;
            default:
                System.out.println("Jumlah vokal ganjil: " + jumlahVokal);
        }

        System.out.print("Kalimat terbalik: ");
        char[] charArray = kalimat.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }
}
