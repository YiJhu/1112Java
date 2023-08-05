public class Main {
    public static void main(String[] args) {
        int[][] scores = {{80, 90, 40, 70, 60}, {70, 100, 50, 80, 90}};
        int[] max = new int[scores.length];
        int[] min = new int[scores.length];
        int[] failCount = new int[scores.length];
        double[] ave = new double[scores.length];
        // 設定初始值
        for (int i = 0; i < scores.length; i++) {
            max[i] = 0;
            min[i] = 100;
            failCount[i] = 0;
            ave[i] = 0;
        }
        // 找出每班最高分、最低分、不及格人數並計算成績
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                // 比對最高分
                if (scores[i][j] > max[i]) {
                    max[i] = scores[i][j];
                }
                // 比對最低分
                if (scores[i][j] < min[i]) {
                    min[i] = scores[i][j];
                }
                // 檢查是否及格
                if (scores[i][j] < 60) {
                    failCount[i]++;
                }
                // 累加總分
                ave[i] += scores[i][j];
            }
        }

        // 顯示結果
        for (int i = 0; i < scores.length; i++) {
            System.out.println("最高分:" + max[i]);
            System.out.println("最低分:" + min[i]);
            System.out.println("不及格:" + failCount[i]);
            System.out.println("平均:" + ave[i] / 5);

        }
    }
}

