import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] scores = new double[2][3];
        Scanner scan = new Scanner(System.in);
        // 輸入成績
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("第" + (i + 1) + "班第" + (j + 1) + "位學生成績:");
                scores[i][j] = scan.nextDouble();
            }
        }
        // 計算各班總分
        double[] sums = {0, 0};
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++)
                sums[i] += (scores[i][j]);
            System.out.print("第" + (i + 1) + "班總分:" + sums[i] + "\n");
        }
    }
}
