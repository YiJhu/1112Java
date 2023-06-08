public class Rect extends Shape {
    private double length, width;

    public Rect(double l, double w) {
        // 建構式
        this.length = l;
        this.width = w;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String whatShape() {
        return "Rect";
    }
}
