

public abstract class Transport {
    public int engineCapacity;
    public int hp;
    public String color;

    public Transport() {
    }

    public Transport(Auto target) {
        if (target != null) {
            this.engineCapacity = target.engineCapacity;
            this.hp = target.hp;
            this.color = target.color;
        }
    }

    public abstract Transport clone();
    public abstract void startEngine();


}
