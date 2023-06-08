public class Main {
    public static void main(String[] args) {
        // 多型
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            switch (i % 2) {
                case 0:
                    // 圓
                    shapes[i] = new Circle(i + 1);
                    break;
                case 1:
                    // 矩形
                    shapes[i] = new Rect(i + 1, i + 2);
                    break;
            }
            System.out.println("形狀:" + shapes[i].whatShape() + "面積:" + shapes[i].getArea());
        }
    }
}