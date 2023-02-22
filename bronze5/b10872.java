package bronze5;

import java.util.Scanner;

public class b10872 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        System.out.println(fact(N));
    }

    public static int fact(int num) {
        if(num<=1)
            return 1;
        else
            return fact(num-1) * num;
    }
}
