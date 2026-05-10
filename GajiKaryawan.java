import java.util.Scanner;

public class PenghasilanKaryawan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String golongan;
        int jamLembur;
        double gajiPokok = 0;
        double gajiLembur = 0;
        double jumlahPenghasilan;

        // INPUT
        System.out.print("Input Golongan (A/B/C): ");
        golongan = input.next().toUpperCase();

        System.out.print("Input Jam Lembur: ");
        jamLembur = input.nextInt();

        // Declare Gaji Golongan
        switch (golongan) {
            case "A":
                gajiPokok = 5000000;
                break;

            case "B":
                gajiPokok = 6500000;
                break;

            case "C":
                gajiPokok = 9500000;
                break;

            default:
                gajiPokok = 0;
        }

        // Perhitungan Jam Lembur
        if (jamLembur == 1) {
            gajiLembur = gajiPokok * 0.30;

        } else if (jamLembur == 2) {
            gajiLembur = gajiPokok * 0.32;

        } else if (jamLembur == 3) {
            gajiLembur = gajiPokok * 0.34;

        } else if (jamLembur == 4) {
            gajiLembur = gajiPokok * 0.36;

        } else if (jamLembur >= 5) {
            gajiLembur = gajiPokok * 0.38;
        }

        // Perhitungan Jumlah Penghasilan
        jumlahPenghasilan = gajiPokok + gajiLembur;

        // OUTPUT
        System.out.println("\nJumlah Penghasilan: Rp " + jumlahPenghasilan);

        input.close();
    }
}
