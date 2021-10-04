package mypackage;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Start of the program");

        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i * 10);
        }

        System.out.println("End of the program");

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int[] array = new int[10];
        System.out.println();
        for(int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Element with index " + i + " is: " + array[i]);
        }

        System.out.println();
        // foreach loop перебирает все элементы массива
        for (int element : array) {
            System.out.println(element);
        }

        System.out.println();
        // while loop
        int i = 0;
        boolean bool = true;
        while (bool) {
            System.out.println("While: " + i);
            i++;
            if(i == 5) bool = false;
        }

        System.out.println();
        // do-while loop
        i = 10;
        do {
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);
    }
}
