package bronze5;

import java.util.Scanner;

public class b2743 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        String[] strr = str.split("");

        int count = 0;

        for(String c : strr) {
            count++;
        }

        System.out.println(count);
    }
}
