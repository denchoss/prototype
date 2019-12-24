public abstract class State {
    Transport transport;

    State(Transport transport){
        this.transport=transport;
    }
    public abstract void accelerate();
    public void stop(){
        System.out.print("stop\n");
    }
}
