package mypackage;

public class StringClass {

    public static void main(String[] args) {
        String s = "Hello world!";

        System.out.println(s.equals("Hello world!"));
        System.out.println(s.equals("Hello!"));

        String s2 = "hello";

        System.out.println(s.equals(s2));

        s = "text";
        s2 = "TEXT";

        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2)); // сравнение строк без учета регистра

        s = "TeXt";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(1)); // получение символа в строке
        System.out.println(s.indexOf("Xt")); // узнать индекс у части строки

        s = "Hello, World!";
        System.out.println(s.contains("Hello")); // проверка на наличие заданной строки
        System.out.println(s.contains("text"));
        System.out.println(s.length()); // длина строки

        System.out.println();
        System.out.println(s.startsWith("He")); // проверка начиется ли строка на указанное вхождение
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("He")); // проверка начиется ли строка на указанное вхождение
        System.out.println(s.endsWith("!"));

        s = "hello,world";
        System.out.println();
        String[] array = s.split(","); // разделение строки по указанному символу
        System.out.println(array[0]);
        System.out.println(array[1]);

        String str = "My name is %s! I'm %d years old!";
        int age = 30;
        String name = "Ivan";

        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Vasya", 10));

        System.out.println();

        String age2 = "30";
        int a = Integer.parseInt(age2); // получает число из строки

        System.out.println(a * 3);

        s = "Hello, world!";
        System.out.println(s.substring(1, 5)); // выделяет строку из строки (указывать с какого по какой индекс обрезать)
        System.out.println(s.substring(1, 7));

        System.out.println(s.substring(7, s.length() - 2));

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;

        res = s1 + s2 + s3;
        System.out.println(res);

        res = s1.concat(s2).concat(s3); // конкатенация лучше в производительности
        System.out.println(res);
    }
}
