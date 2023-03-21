package bronze5;

import java.util.Scanner;

public class b23235 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = 1;
        while(true) {
            String str = scan.nextLine();
            if(str.equals("0")) break;
            System.out.println("Case " + begin + ": Sorting... done!");
            begin++;
        }
        scan.close();
    }
}
