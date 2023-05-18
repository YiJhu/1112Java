public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        for (int i = 0; i < shapes.length; i++) {
            if (i < 2) {
                shapes[i] = new Circle(i + 1);
            } else {
                shapes[i] = new Rect(i + 1, i + 2);
            }
        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
        }
    }
}