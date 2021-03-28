package test1;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String Kode;
        String Jam;
        int harga = 40000;
        Scanner input = new Scanner(System.in);
        System.out.println("Pemesanan Tiket Bioskop");
        System.out.print("Masukkan nama: ");
        String nama = input.next();
        System.out.print("Masukkan nomor telepon: ");
        String nomor = input.next();

        test1.Tiket user = new test1.Tiket();
        user.setNama(nama);
        user.setTelepon(nomor);

        System.out.println("Pilihan film: ");
        System.out.println("1. Film komedi");
        System.out.println("2. Film horor");
        System.out.println("3. Film romantis");
        System.out.print("Masukkan pilihan: ");
        int a = input.nextInt();
        String kode;
        if(a==1){
            kode = "A12";
        }else if (a==2){
            kode = "B23";
        }else {
            kode = "C31";
        }
        System.out.println("Pilihan jam: ");
        System.out.println("1. 14.00");
        System.out.println("2. 17.00");
        System.out.println("3. 20.00");
        System.out.print("Masukkan pilihan: ");
        int b = input.nextInt();
        String jam;
        if(b==1){
            jam = "14.00";
        }else if (b==2){
            jam = "17.00";
        }else {
            jam = "20.00";
        }
        user.setKode(kode);
        user.setWaktu(jam);
        user.setHarga(harga);

        System.out.println("==================================");
        System.out.println("PEMESANAN ");
        System.out.println("==================================");
        System.out.println("Customer Name\t\t: "+user.getNama());
        System.out.println("Customer Phone\t\t: "+user.getTelepon());
        System.out.println("==================================");
        System.out.println("Kode Film\t\t: "+user.getKode());
        System.out.println("Jam Film\t\t: "+user.getWaktu());
        System.out.println("Harga Film\t\t: "+user.getHarga()+ " Rupiah");
        System.out.println("==================================");
        System.out.println("\n");
    }
}
