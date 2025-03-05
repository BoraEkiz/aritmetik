//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayı ");
        int sayıa = scanner.nextInt();

        System.out.print("İkinci sayı ");
        int sayıb = scanner.nextInt();

        System.out.print("Üçüncü sayı ");
        int sayıc = scanner.nextInt();

        System.out.println("Girdiğiniz sayılar: " + sayıa + ", " + sayıb + ", " + sayıc);

        scanner.close();

        System.out.println( sayıa + sayıb * sayıc - sayıc );

    }
}