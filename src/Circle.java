public class Circle extends Figure {
    double pi = 3.14;
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double Square() {
        return pi*(r*r);
    }

    @Override
    public String toString() {
        return "S Circle: " + pi*(r*r);
    }
}
