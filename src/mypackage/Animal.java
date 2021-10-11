package mypackage;

public class Animal {
    protected String name;
    protected String color;

    public int var;
    // доступ к полю с модификатором private только внутри класса
    private int var1;
    // доступ к полю с модификатором protected внутри класса и в классах наследниках и в классах пакета
    protected int var2;
    // тип доступа package, модификатор доступа по умолчанию, видимость поля ограничена пакетом
    int var3;

    public void walk(String place) {

        System.out.println("We are walking here: " + place);
        var = 10;
        var1 = 20;
    }

    public void sleep() {
        System.out.println("Zzzz");
    }
}
