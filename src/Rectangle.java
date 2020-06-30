public class Rectangle extends Figure {
    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Square() {
        return a*b;
    }

    @Override
    public String toString() {
        return "S Rectangle: " + a*b;
    }
}
