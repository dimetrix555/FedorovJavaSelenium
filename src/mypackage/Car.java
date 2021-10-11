package mypackage;

public class Car {

    // Модификатор final делает переменные и методы финальнымими и не допускает их перезаписи
    // Модификатор static позволяет делать переменные и методы в единственном экземпляре и вызыватся через класс
    // Их изменение производит изменение во всех объектах данного класса
    final static int var2 = 100;
    static int var = 10;
    static void method() {
        System.out.println("Static method.");
    }

    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    // constructor метод который вызывается при создании объекта класса
    // название метода конструктора совпадает с именем класса
    public Car() {
        System.out.println("New car created!");
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int height, int width, int length) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.println("New weight: " + this.weight);
    }

    public void drive(int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("We are driving!");
        } else {
            System.out.println("Cannot drive!");
        }

    }
}
