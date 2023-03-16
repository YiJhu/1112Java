import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] scores = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("輸入第" + (i + 1) + "位學生成績(負值表示結束)");
            scores[i] = scan.nextInt();
            if (scores[i] < 0) {
                break;
            }
        }
        int sum=0;
        int count=0;
        for(int i=0;i<10;i++) {
            if (scores[i] < 0) {
                break;}
            sum += scores[i];
            count++;
            if (scores[i] < 60) {
                System.out.println(scores[i]);}
            double ave = sum / count;
            System.out.println("總分:" + sum);
            System.out.println("平均:" + ave);
        }
    }
}