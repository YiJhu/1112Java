public class Rect extends Shape {

    public double len, width;

    public Rect(double len, double width) {
        super();
        this.len = len;
        this.width = width;
    }

    @Override
    public double getArea() {
        return len * width;
    }
}
