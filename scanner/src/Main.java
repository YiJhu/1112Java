import java.util.Scanner;
//print -> 接續當行
//println -> 換行輸出

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("輸入國文成績:");
        int scoreCh = scan.nextInt();
        System.out.print("輸入英文成績:");
        int scoreEn = scan.nextInt();
        System.out.print("輸入數學成績:");
        int scoreMa = scan.nextInt();
        int sum = scoreCh + scoreEn + scoreMa;
        System.out.println("總成績:" + sum);
    }
}
