import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Fibonacci Serisinin Uzunluğunu Giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int n1 = 1;
        int n2 = 0;


        for(int i = 1; i<=sayi; i++){

            toplam = n1+n2;
            n1=n2;
            n2 = toplam;
            System.out.println(toplam);
        }

    }
}