import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("輸入 國、英、數 成績，並用空格區隔:");
        Scanner scan = new Scanner(System.in);
        int chScore = scan.nextInt();
        int enScan = scan.nextInt();
        int maScore = scan.nextInt();
        int sum = chScore + enScan + maScore;
        double ave = sum / 3.0;
        System.out.println("總成績:" + String.valueOf(sum) + "\n平均成績：" + String.valueOf(ave));
        /* 這是分隔號 */
        System.out.println("計算 a+(b-5)*c/3");
        System.out.print("輸入 a,b,c 的值:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double cal = a + (b - 5) * c / 3.0;
        System.out.println("答案:" + String.valueOf(cal));
    }
}