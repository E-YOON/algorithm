package bronze5;

import java.util.Scanner;

public class b8545 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}
