package hitung;
import java.util.Scanner;
public class MainHitung {
    public static void main(String[] args) {
        Hitung hit = new Hitung();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Pembilang 1 : ");
        int a = input.nextInt();
        System.out.print("Masukkan Nilai Penyebut 1  : ");
        int b = input.nextInt();
        System.out.print("Masukkan Nilai Pembilang 2 : ");
        int c = input.nextInt();
        System.out.print("Masukkan Nilai Penyebut 2  : ");
        int d = input.nextInt();
        System.out.println("NILAI");
        System.out.println("Nilai 1 : " + a + "/" + b);
        System.out.println("Nilai 2 : " + c + "/" + d);
        System.out.println("Hitung Penjumlahan");
        Hitung.hitungPenjumlahan(a, b, c, d);
        hit.sederhana();
        System.out.println("Hitung Pengurangan");
        Hitung.hitungPengurangan(a, b, c, d);
        hit.sederhana();
        System.out.println("Hitung Perkalian");
        hit.hitungPerkalian(a, b, c, d);
        hit.sederhana();
        System.out.println("Hitung Pembagian");
        hit.hitungPembagian(a, b, c, d);
        hit.sederhana();
    }
}