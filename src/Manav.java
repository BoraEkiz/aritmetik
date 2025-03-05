
import java.util.Scanner;
public class Manav {
    public float armut = 2.14f;
    public float elma = 2.47f;
    public float domates =1.11f;
    public float muz =0.95f;
    public float patlican =5.00f;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Manav manav = new Manav();

        System.out.print("Armut kaç kilo: ");
        float m1 = scanner.nextFloat();
        System.out.print("elma kaç kilo: ");
        float m2 = scanner.nextFloat();
        System.out.print("domates kaç kilo: ");
        float m3 = scanner.nextFloat();
        System.out.print("muz kaç kilo: ");
        float m4 = scanner.nextFloat();
        System.out.print("patlıcan kaç kilo: ");
        float m5 = scanner.nextFloat();
        float toplamFiyat = (m1 * manav.armut) + (m2 * manav.elma) + (m3 * manav.domates) + (m4 * manav.muz) + (m5 * manav.patlican);


        System.out.println("Toplam Tutar: " + toplamFiyat);
        scanner.close();
    }


}
