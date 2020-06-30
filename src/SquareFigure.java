public class SquareFigure {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        figures[0] = new Triangle(3,6);
        figures[1] = new Circle(10);
        figures[2] = new Rectangle(57.7,4);
        figures[3] = new Triangle(67,32.68);
        figures[4] = new Circle(432.2);
        figures[5] = new Rectangle(80.7,80.7);

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
