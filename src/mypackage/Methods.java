package mypackage;

public class Methods {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int sum;

        sum = getSum(a, b);
        System.out.println(sum);
        sum = getSum(10, 150);
        System.out.println(sum);
        System.out.println(getSum(2, 11));

        showSum(10, 51, 77);
        showSum(5, 12, 14);

        saySomething();

        sayHello("Petya");
        String name = "Vasya";
        sayHello(name);

        showSumToPerson("Vanya", 15, 11, 33);

        boolean result = showSum(1, 22, 333);
        System.out.println(result);

        System.out.println();
        int res;
        res = getSum(1, 10);
        System.out.println(res);

        res = getSum(5, 100, 66);
        System.out.println(res);

        sayHello("Petya");
        sayHello("Vasya", "Vanya");
        sayHello();

        int[] array = {1, 22, 52, 34, 16};

        int count = getSum(array, "Oleg");
        System.out.println(count + 100);

    }

    public static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    public static int getSum(int x, int y, int z) {
        int sum;
        sum = x + y + z;
        return sum;
    }

    public static int getSum(int[] array, String name) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is: " + sum);
        return sum;
    }


    public static boolean showSum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
        return true;
    }

    public static void saySomething() {
        System.out.println();
        System.out.println("Hello!");
        System.out.println("I'm running!");
        System.out.println("You see me!");
    }

    public static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }

    public static void sayHello(String name1, String name2) {
        System.out.println();
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }

    public static void sayHello() {
        System.out.println();
        System.out.println("Hello");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }

    public static void showSumToPerson(String name, int a, int b, int c) {
        System.out.println("Start of the program");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of the program");
    }
}
