package recal_day_06;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int arr[] = {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) { // j=0 ve j=i olarakta dene aklinda bulunsun
                if (arr[i] + arr[j]==9){
                    System.out.println(arr[i]+ "ve"+arr[j]+ "toplam :"+istenenToplam);
                }
            }

        }


    }
}
