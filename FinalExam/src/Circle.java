public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public String whatShape() {
        return "Circle";
    }

    @Override
    public double getPerimeter() {
        return ((r + r) * Math.PI);
    }
}



