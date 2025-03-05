import java.util.Scanner;
public class VucutkitleIndeks {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen boyunuzu(metre cinsinden giriniz):");
        float boy = scanner.nextFloat();

        System.out.print("lütfen kilonuzu giriniz:");
        int kilo = scanner.nextInt();

        scanner.close();
        float VucutkitleIndeksi = kilo / (boy * boy);

        System.out.println("Vucut kitle indeksiniz:" + VucutkitleIndeksi);
    }
}
