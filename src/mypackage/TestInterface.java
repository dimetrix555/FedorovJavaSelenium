package mypackage;

public class TestInterface {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Plane plane = new Plane();

        auto.go();
        auto.stop();
        auto.method1();
        auto.method2();

        plane.go();
        plane.stop();
        plane.setSpeed(800);

    }
}
