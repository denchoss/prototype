

public class Motocycle extends Transport{
    private int numberOfWheels=2;

    public Motocycle() {
    }

    public Motocycle(Motocycle target) {
        if (target != null) {
            this.engineCapacity = target.engineCapacity;
            this.hp = target.hp;
            this.color = target.color;
        }
    }

    public Motocycle clone(){
        return new Motocycle(this);
    }

    public void startEngine(){
        System.out.print("use kickstart\n");
        this.changeState(new EngineOn(this));
    }


}
