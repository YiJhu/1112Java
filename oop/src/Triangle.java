public class Triangle {
    private double bottom, height;

    public Triangle(double b, double h) {
        bottom = b;
        height = h;
    }

    public void setBH(double b, double h) {
        bottom = b;
        height = h;
    }

    public double getBottom() {
        return bottom;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return (bottom * height) / 2;
    }
}
