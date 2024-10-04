import java.util.Scanner;
public class Modifikasipercobaan1 {
     public static void main(String[] args) {
        Scanner inputAbsen26 = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        int tahun = inputAbsen26.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Tahun kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }

        inputAbsen26.close();
     }
}