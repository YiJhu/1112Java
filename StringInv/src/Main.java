import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("輸入一個字串：");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        boolean b = true;
        while (b) {
            System.out.println("選項：");
            System.out.println("1. 字串反轉");
            System.out.println("2. 字串排序");
            System.out.println("其它結束");
            System.out.print("選擇：");
            int x = scan.nextInt();
            switch (x) {
                case 1:
                    String s2 = invertString(s);
                    System.out.println((s2));
                    break;
                case 2:
                    String s3 = sortString(s);
                    System.out.println((s3));
                    break;
                default:
                    b = false;
            }
        }
    }

    public static String invertString(String s) {
        String newS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            String temp = s.substring(i, i + 1);
            newS += temp;
        }
        return newS;
    }

    public static String sortString(String s) {
        char[] arr = s.toCharArray();
        // 用氣泡排序法排列字串並回傳結果
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 0; j < (s.length() - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    char c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                }
            }
        }
        String newS = new String(arr);
        return newS;
    }
}
