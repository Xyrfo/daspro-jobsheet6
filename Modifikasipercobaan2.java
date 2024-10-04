import java.util.Scanner;
public class Modifikasipercobaan2 {
    public static void main(String[] args) {
        Scanner Absen26 =  new Scanner(System.in);
        int pilihan_menu;
        double harga;
        String member;
        double diskon;
        double total_bayar;
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("memasukan angka dari menu yang dipilih = ");
        pilihan_menu = Absen26.nextInt();
        Absen26.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = Absen26.nextLine();
        System.out.println("--------------------------------------");
        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukan pilihan menu dengan benar");
            return; // Menghentikan eksekusi lebih lanjut jika pilihan salah 
        }

        //Menghitung total bayar setelah diskon
        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
        else if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukan pilihan menu dengan benar");
            return; // Menghentikan eksekusi lebih lanjut jika pilihan salah 
        }
         //Menghitung total bayar
         System.out.println("Total bayar = " + harga);

        }else {
            System.out.println("member tidak valid");
        }
        System.out.println("--------------------------------------");
    }
}