package recal_day_08;

public class C05_ForEach {
    public static void main(String[] args) {
        // String[] list = {"fruits", "vegetables", "meat", "milk"};
        // print array with for each loop
        // print length of each element

        // Part 2:
        // Print all the elements from array using for eachLoop
        // If an element starts with 'v' then quit the loop

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String element: list) {
            System.out.print(element + ":"+ element.length()+" ");
        }

        System.out.println();

        for (String element1: list) {
            if (element1.startsWith("v")){
                break;
            }
            System.out.println(element1);

        }
    }
}
