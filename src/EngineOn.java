public class EngineOn extends State {
    EngineOn(Transport transport) {
        super(transport);
    }

    @Override
    public void accelerate() {
        System.out.print("moving\n");
    }
}
