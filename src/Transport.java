

public abstract class Transport {
    public int engineCapacity;
    public int hp;
    public String color;
    private State state=new EngineOff(this);


    public Transport() {
    }

    public Transport(Auto target) {
        if (target != null) {
            this.engineCapacity = target.engineCapacity;
            this.hp = target.hp;
            this.color = target.color;
        }
    }
    public void changeState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public abstract Transport clone();
    public void startEngine(){
        this.changeState(new EngineOn(this));
    }
    public void accselerate(){
        state.accelerate();
    }
    public void stop(){
        state.stop();
    }


}
