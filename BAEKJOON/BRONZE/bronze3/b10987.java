// 모음의 개수

import java.util.Scanner;

public class b10987 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        String str2 = str.replaceAll("a|e|i|o|u", "");

        System.out.println(str.length() - str2.length());
    }
}
