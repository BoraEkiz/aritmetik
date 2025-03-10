import java.util.Scanner;

public class mükemmelsayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;  //
            }
        }
        if (toplam == sayi) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }
}
