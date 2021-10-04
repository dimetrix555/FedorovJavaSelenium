package mypackage;

public class Conditions {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("Start of program");
        if (i > 10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else if (i < 10 && i > 5) {
            System.out.println("i < 10 and i > 5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }

        System.out.println("End of program");


        System.out.println();

        int a = 95;

        if (a > 50) {
            System.out.println("a > 50");
            if (a > 90) {
                System.out.println("a > 90");
            }
            else {
                System.out.println("a <= 90");
            }
        }
        else {
            System.out.println("a <= 50");
        }

        int b = 10;

        switch (b) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            default:
                System.out.println("I don't know the number!");
        }
    }
}
