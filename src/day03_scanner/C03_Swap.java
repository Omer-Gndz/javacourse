package day03_scanner;

public class C03_Swap {

    public static void main(String[] args) {
        // bir önceki swap sorusunu boş kova kullanmadan yapın

        int sayi1=10;
        int sayi2=20;

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("swap'dan sonra sayi1 : " + sayi1); // 20
        System.out.println("swap'dan sonra sayi2 : " + sayi2); // 10


    }
}
