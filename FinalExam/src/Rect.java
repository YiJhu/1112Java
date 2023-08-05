public class Rect extends Shape {
    private double l, w;

    public Rect(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double getArea() {
        return l * w;
    }

    @Override
    public String whatShape() {
        return "Rect";
    }

    @Override
    public double getPerimeter() {
        return (l + l + w + w);
    }
}
