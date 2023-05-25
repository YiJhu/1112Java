public class Circle {
    private double area;
    private double radius;
    private AreaCallback callback;

    public void setRadius(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
        callback.areaChanged(area);
    }

    public void setCallback(AreaCallback callback) {
        this.callback = callback;
    }
}
