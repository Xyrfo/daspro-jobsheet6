import java.util.Scanner;
public class Pemilihan2Percobaan26 {
    public static void main(String[] args) {
        Scanner Absen26 =  new Scanner(System.in);
        int tahun;
        System.out.print("masukan tahun: ");
        tahun = Absen26.nextInt(); 
        if ((tahun % 4 == 0)) {
            if ((tahun % 100)!= 0)
                System.out.println("Tahun Kabisat"); 
        } else
            System.out.println("Bukan Tahun Kabisat");
        }
    }