package jaket;
import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        jaket filkom = new jaket();
        int lagi;
        System.out.println("Selamat Datang CV.LabKomDas");
        System.out.println("MENU JAKET : ");
        do{
        System.out.println("NAMA JAKET\tHARGA JAKET");
        System.out.println("1.Jaket A\tRp.100000");
        System.out.println("2.Jaket B\tRp.125000");
        System.out.println("3.Jaket C\tRp.175000");
        System.out.print("Masukkan pilihan jaket yang anda ingin dibeli : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Jumlah JaketA yang ingin dibeli : ");
                int jumlahA = input.nextInt();
                filkom.JaketA(jumlahA);
                System.out.println("Total Harga Jaket A : Rp." + filkom.getTotalA());
                filkom.Total();
                filkom.getTotal();
                break;
            case 2:
                System.out.print("Masukkan Jumlah JaketB yang ingin dibeli : ");
                int jumlahB = input.nextInt();
                filkom.JaketB(jumlahB);
                System.out.println("Total Harga Jaket B : Rp." + filkom.getTotalB());
                filkom.Total();
                filkom.getTotal();
                break;
            case 3:
                System.out.print("Masukkan Jumlah JaketC yang ingin dibeli : ");
                int jumlahC = input.nextInt();
                filkom.JaketC(jumlahC);
                System.out.println("Total Harga Jaket C : Rp." + filkom.getTotalC());
                filkom.Total();
                filkom.getTotal();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");}
System.out.println("Beli lagi ? (1/2)");
        System.out.print("Pilihan anda : ");
        lagi = input.nextInt();}
    while (lagi == 1);
    System.out.println ("Jadi Total Harga yang Anda harus Bayar Adalah : Rp." + filkom.getTotal());
    }
}
