public class Triangle {

    private double area;
    private double bottom, height;
    private AreaCallback callback;

    public void setBH(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
        area = bottom * height / 2;
        callback.areaChanged(area);
    }

    public void setCallback(AreaCallback callback) {
        this.callback = callback;
    }
}
