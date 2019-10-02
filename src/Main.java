import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Klavyeden girilen sayının asal oluğ olmadığını kontrol eden algoritma ...
        ArrayList list = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi giriniz");
        int a = input.nextInt();
        if (a == 1) {
            System.out.println("1 asal sayı değildir.");
        } else if (a == 2) {
            System.out.println("2 En Küçük asal sayidir.");
        } else {
            for (int i = 2; i < a; i++) {
                int remainder = a % i;
                if (remainder == 0) {
                    list.add(remainder);
                }
            }
            if (list.contains(0)) {
                System.out.println("Sayi asal sayı değildir..");
            } else {
                System.out.println("Sayı asaldır.");
            }
        }
    }
}

