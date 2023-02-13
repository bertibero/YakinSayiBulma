import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");
        int n = input.nextInt();

        int [] list = {15, 21, 36, 43, 59, 62, 71, 80, 97, 150, -11, -26, -35, -44};

        int buyuk = list[9];
        int kucuk = list[13];

        for (int i : list){
            if (i > n) {
                if ((i - n) < buyuk - n) {
                    buyuk = i;
                }
            }else {
                buyuk = buyuk;
            }
            if (i < n){
                if((n - i) < n - kucuk){
                    kucuk = i;
                }
            }else {
                kucuk = kucuk;
            }
        }
        System.out.println("Girdiğiniz sayıdan büyük en küçük sayı :" + buyuk);
        System.out.println("Girdiğiniz sayıdan küçük en büyük sayı :"+ kucuk);
    }
}