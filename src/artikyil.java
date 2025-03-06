import java.util.Scanner;
public class artikyil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("lütfen yılı giriniz");
        int rakam = scanner.nextInt();

        if (rakam%4==0)
        {
            System.out.printf("bu bir artık yildir"+rakam);
        }
        else
        {
            System.out.println("bu bir artık yıl değildir");

        }



    }
}
