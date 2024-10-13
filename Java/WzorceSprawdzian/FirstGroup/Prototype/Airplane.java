package wisniowa.tc.FirstGroup.Prototype;

public class Airplane implements Cloneable {
    private int speed;
    private String name;
    private String color;

    public Airplane(int speed, String name, String color) {
        this.speed = speed;
        this.name = name;
        this.color = color;
    }

    public Airplane(Airplane target) {
        this.color = target.color;
        this.speed = target.speed;
        this.name = target.name;
    }

    @Override
    public Cloneable clone() {
        return new Airplane(this);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
