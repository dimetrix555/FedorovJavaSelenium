package mypackage;

public class Plane implements Transport{

    @Override
    public void go() {
        System.out.println("We are fly by plane!");
    }

    @Override
    public void stop() {
        System.out.println("We are landing!");
    }

    public void setSpeed(int speed) {
        System.out.println("Our speed is: " + speed);
    }
}
