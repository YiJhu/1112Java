import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("輸入 國、英、數 成績:");
        Scanner scan = new Scanner(System.in);
        int  chScore = scan.nextInt();
        int  enScore = scan.nextInt();
        int  mathScore = scan.nextInt();

        if(chScore >= enScore && enScore >= mathScore) {
            System.out.print("國英數");

        } else if (chScore >= mathScore && mathScore >= enScore) {
            System.out.print("國數英");

        } else if (enScore >= chScore && chScore >= mathScore) {
            System.out.print("英國數");

        } else if (enScore >= mathScore && mathScore >= chScore) {
            System.out.print("英數國");

        } else if (mathScore >= enScore && enScore >= chScore) {
        System.out.print("數英國");

        } else {
            System.out.print("數國英");
        }
    }
}