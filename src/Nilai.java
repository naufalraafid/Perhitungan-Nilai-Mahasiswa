import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("NIM  : ");
        String nim = scanner.nextLine();

        System.out.print("Nilai Tugas Besar : ");
        double nilaiTubes = scanner.nextDouble();
        System.out.print("Nilai Quiz  : ");
        double nilaiQuiz = scanner.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Nilai UTS   : ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Nilai UAS   : ");
        double nilaiUAS = scanner.nextDouble();
        scanner.nextLine();
        double nilaiAkhir = (nilaiTubes * 0.30) + (nilaiQuiz * 0.10) + (nilaiTugas * 0.10) + (nilaiUTS * 0.25) + (nilaiUAS * 0.25);

        System.out.println("-------->Nilai Matakuliah Pemrograman Berorientasi Objek<--------");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek : " + nilaiAkhir);

        scanner.close();
    }
}
