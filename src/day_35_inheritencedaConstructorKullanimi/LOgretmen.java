package day_35_inheritencedaConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){
        System.out.println("LOgretmen parametresiz cons");
    }
    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli cons");
    }
}
