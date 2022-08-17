package day13_interviewQuestions;

public class Q02 {
    public static void main(String[] args) {
        /*
         // Stringi ters cevirmek icin bir Java Programi yazin
         //1.Yol: StringBuilder () kullanarak
         //2.Yol: String Classini kullanarak
         //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */

        //1.Yol: StringBuilder () kullanarak
        String input = "All is well";

        StringBuilder str=new StringBuilder();
        str.append(input); // StringBuilder methodur ekleme yapar
        System.out.println("str = "+ str);

        String tersInput=str.reverse().toString();
        System.out.println("tersInput = " + tersInput);

        System.out.println("2.yol");

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));

        }
    }
}
