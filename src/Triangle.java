public class Triangle extends Figure {
    double a,h;
    public Triangle(double a,double h) {
        this.a=a;
        this.h=h;
    }

    @Override
    public double Square() {
        return (a/2)*h;
    }

    @Override
    public String toString() {
        return "S Triangle: "+(a/2)*h;
    }
}
