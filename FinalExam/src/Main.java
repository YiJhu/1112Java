public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            switch (i % 2) {
                case 0:
                    shapes[i] = new Rect(i + 2, i + 3);
                    break;
                case 1:
                    shapes[i] = new Circle(i + 2);
                    break;
            }
        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("形狀:" + shapes[i].whatShape() + ", 周長:" + shapes[i].getPerimeter() + ", 面積:" + shapes[i].getArea());
        }
    }
}