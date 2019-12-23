public class Main {
    public static void main(String[] args){

        Auto auto = new Auto();
        auto.engineCapacity = 2;
        auto.color = "red";

        Auto anotherAuto =  auto.clone();

        if (auto.equals(anotherAuto)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }

    }
}
