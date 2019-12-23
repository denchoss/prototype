import java.util.Objects;
public class Auto  {
    public int engineCapacity;
    private int hp=120;
    public String color;

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

    public boolean equals(Object object2) {
        if (!(object2 instanceof Auto)) return false;
        Auto shape2 = (Auto) object2;
        return shape2.engineCapacity == engineCapacity && shape2.hp == hp && Objects.equals(shape2.color, color);
    }
}
