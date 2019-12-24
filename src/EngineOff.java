public class EngineOff extends State {
    EngineOff(Transport transport) {
        super(transport);
    }

    @Override
    public void accelerate() {
        System.out.print("don't moving\n");
    }
}
