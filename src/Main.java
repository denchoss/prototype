public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.engineCapacity = 2;
        auto.hp = 120;
        auto.color = "red";

        Auto anotherAuto = auto.clone();

        Motocycle motocycle = new Motocycle();
        motocycle.engineCapacity = 2;
        motocycle.hp = 120;
        motocycle.color = "red";

        anotherAuto.startEngine();
        motocycle.accselerate();
        anotherAuto.accselerate();
        auto.stop();

        auto.events.subscribe("car is free",new Listener1());
        auto.carClose();


    }
}
