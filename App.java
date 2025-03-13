import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean x = false;
        if (!x) {
            System.out.println("ini adalah blok if");
        }

        int a = 10;
        if(a > 5) {
            System.out.println("a lebih besar dari 5");
        } else { 
            System.out.println("a lebih kecil dari 5");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka: ");
        int nilai = input.nextInt();

        if (nilai > 80) {
            System.out.println("nilai anda A");
        } else if (nilai >= 70) {
            System.out.println("nilai anda B");
        } else if (nilai > 60) {
            System.out.println("nilai anda C");
        } else if (nilai > 50) {
            System.out.println("nilai anda D");
        } else{
            System.out.println("nilai anda E");

        input.close();

        }

        int day = 1;
        switch(day) {
            case 1:
                System.out.println("senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }

        //belajar ternary operator
        int angka = 5;
        if (angka % 2 == 0){
            System.out.println("Angka genap");
        } else  {
            System.out.println("Angka ganjil");
        }

        String hasil = (angka % 2 == 0 ) ? "Angka genap": "Angka ganjil";
        System.out.println(hasil);

        for(int i = 0; i < 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        //while loop
        int i = 0;
        while (i < 5){
            System.out.println("Perulangan ke-" + (i + 1));
            i++;
        }

        //do while loop
        do { 
            System.out.println("Perulangan ke-" + ( i+ 1));
            i++;
        } while ( i < 5);

        //for each loop
        int numbers [] = {1,2,3,4,5};
        for (int j : numbers){
            System.out.println(j);
        }

        //break dan countinue
        for( int j =0; j < 5; j++){
            if (i == 3){
            break;
            }
        System.out.println("perulangan ke-" + j);
        }


        while (true){
            System.out.println("Pilih menu");
            System.out.println("1. Menu 1");
            System.out.println("2. Menu 2");
            System.out.println("3. Menu 3");
            System.out.println("0. Keluar");

            Scanner input2 = new Scanner(System.in);
            System.out.print("Masukkan pilihan: ");
            int pilihan = input2.nextInt();
            switch(day) {
                case 1:
                    System.out.println("Anda memilih menu 1");
                    break;
                case 2:
                    System.out.println("Anda memilih menu 2");
                    break;
                case 3:
                    System.out.println("Anda keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}

