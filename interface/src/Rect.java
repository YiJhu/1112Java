public class Rect {
    private double area;
    private double length, width;
    private AreaCallback callback;

    public void setLW(double length, double width) {
        this.length = length;
        this.width = width;
        area = length * width;
        callback.areaChanged(area);
    }

    public void setCallback(AreaCallback callback) {
        this.callback = callback;
    }
}
