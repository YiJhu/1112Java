public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(8);
        System.out.println("c1半徑" + c1.getRadius() + "面積" + c1.getArea());
        System.out.println("c2半徑" + c2.getRadius() + "面積" + c2.getArea());
        c1.setRadius(10);
        c2.setRadius(12);
        System.out.println("c1半徑" + c1.getRadius() + "面積" + c1.getArea());
        System.out.println("c2半徑" + c2.getRadius() + "面積" + c2.getArea());
        // Triangle
        Triangle t = new Triangle(8, 5);
        System.out.println("t的底" + t.getBottom() + "高" + t.getHeight() + "面積" + t.getArea());
        t.setBH(10, 5);
        System.out.println("t的底" + t.getBottom() + "高" + t.getHeight() + "面積" + t.getArea());
    }
}