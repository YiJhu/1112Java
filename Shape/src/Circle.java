public class Circle extends Shape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Circle(double r) {
        // 建構式
        this.radius = r;
    }

    @Override
    public String whatShape() {
        return "Circle";
    }
}


