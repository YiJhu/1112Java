import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 建立成績
        int[][] scores = {{90, 50, 70, 80, 30}, {80, 100, 60, 40, 70}};
        System.out.println("1. 找出每班最高分");
        System.out.println("2. 計算每班平均分數");
        System.out.println("3. 計算每班不及格人數");
        System.out.print("選擇功能: ");

        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();

        int[] max = new int[scores.length];
        double[] ave = new double[scores.length];
        int[] failCount = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            max[i] = 0;
            ave[i] = 0;
            failCount[i] = 0;
        }

        switch (op) {
            case 1:
                for (int i = 0; i < scores.length; i++) {
                    for (int j = 0; j < scores[i].length; j++) {
                        if (scores[i][j] > max[i]) {
                            max[i] = scores[i][j];
                        }
                    }
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println(max[i]);
                }
                break;
            case 2:
                for (int i = 0; i < scores.length; i++) {
                    for (int j = 0; j < scores[i].length; j++) {
                        ave[i] += scores[i][j];
                    }
                }
                for (int i = 0; i < scores.length; i++) {
                    ave[i] /= scores[i].length;
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println(ave[i]);
                }
                break;
            case 3:
                for (int i = 0; i < scores.length; i++) {
                    for (int j = 0; j < scores[i].length; j++) {
                        if (scores[i][j] < 60) {
                            failCount[i]++;
                        }
                    }
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println(failCount[i]);
                }
                break;
            default:
                System.out.println("輸入錯誤，請重新輸入。");
        }
    }
}
