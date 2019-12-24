
public class Auto extends Transport  {
    private int numberOfWheels=4;
    public Auto() {
    }

    public Auto(Auto target) {
        if (target != null) {
            this.engineCapacity = target.engineCapacity;
            this.hp = target.hp;
            this.color = target.color;
        }
    }

    public Auto clone(){
        return new Auto(this);
    }

    public void startEngine(){
        System.out.print("turn the ignition key\n");
        this.changeState(new EngineOn(this));
    }

}
