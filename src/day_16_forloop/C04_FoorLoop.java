package day_16_forloop;

public class C04_FoorLoop {
    public static void main(String[] args) {
        // Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

        int bas=20;
        int son=30;
        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i + ", ");
            }else{
                System.out.print(i);
            }
        }

    }
    }
