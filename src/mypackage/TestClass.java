package mypackage;

public class TestClass {
    public static void main(String[] args) {

        Bear bear = new Bear();
        Snake snake = new Snake();

        bear.walk("Forest");
        bear.saySmth();

        snake.walk("Backyard");
        snake.eat();

    }
}
