package assigment05.task02;

public class Wheel {

    private Integer num;

    public Wheel(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Wheel number: " + num + " hashCode: " + this.hashCode() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return num.equals(wheel.num);
    }

    @Override
    public int hashCode() {
        return num.hashCode();
    }
}
