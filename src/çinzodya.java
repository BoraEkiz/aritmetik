import java.util.Scanner;
public class çinzodya {
    public static void main(String[] args) {

        String[] hayvan = {
                "Maymun", "Horoz", "Köpek", "Domuz", "Fare",
                "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan",
                "At", "Koyun"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınız nedir: ");
        int dogumYili = scanner.nextInt();

        int index = dogumYili % 12;

        System.out.println("Çin Zodyağı burcunuz: " + hayvan[index]);

    }
}
