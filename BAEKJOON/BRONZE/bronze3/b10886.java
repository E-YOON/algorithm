// 0 = not cute / 1 = cute

import java.util.Scanner;

public class b10886 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cute = 0;
        int notCute = 0;

        for(int i=0; i<N; i++) {
            int num = scan.nextInt();
            if(num == 0) {
                notCute++;
            } else {
                cute++;
            }
        }
        scan.close();

        String str = cute > notCute ? "Junhee is cute!" : "Junhee is not cute!";
        System.out.println(str);
    }
}
