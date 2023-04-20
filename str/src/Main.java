import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 將輸入字串排序
        System.out.print("輸入任意字串:");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] cArr = s.toCharArray();
        // 用氣泡排序法對字串排序
        for (int i = 0; i < s.length() - 1; i++) {
            // 輪
            for (int j = 0; j < (s.length() - 1 - i); j++) {
                if (cArr[j] > cArr[j + i]) {
                    char c = cArr[j];
                    cArr[j] = cArr[j + 1];
                    cArr[j + 1] = c;
                }
            }
        }
        s = new String(cArr);
        System.out.println(s);
    }
}