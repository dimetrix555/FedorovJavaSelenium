package mypackage;

public class Variables {
    public static void main(String[] args) {
        byte a = 5; // -128 до 127 целочисленный тип Самое маленькое целое — один байт
        short b = -100; // -32768 до 32767 целочисленный тип Короткое целое, два байта
        int c; // -2,147,483,648 до +2,147,483,647 Целое число, 4 байта
        c = 1000000;
        long d = -1222478528; // -9*1018 .. 9*1018 Длинное целое, 8 байт

        System.out.println("byte a: " + a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        double double1 = 133.155;
        System.out.println();
        System.out.println("double double1: " + double1);

        float float1 = 150.32f;
        System.out.println(float1);

        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello";
        String str2 = "world";
        String str3 = str + " " + str2;
        System.out.println(str3);

        char char1 = 'q';
        System.out.println(char1);

        String personName;
        int age;

    }
}
