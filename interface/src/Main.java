public class Main implements AreaCallback {
    public static void main(String[] args) {
        Main m = new Main();

        Circle c = new Circle();
        c.setCallback(m);
        c.setRadius(10.0);

        Rect r = new Rect();
        r.setCallback(m);
        r.setLW(5.0, 8.0);

        Triangle t = new Triangle();
        t.setCallback(m);
        t.setBH(10.0, 5.0);
    }

    @Override
    public void areaChanged(double area) {
        System.out.println("面積:" + area);
    }
}