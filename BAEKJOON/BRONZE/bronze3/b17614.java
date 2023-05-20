// 369

import java.util.Scanner;

public class b17614 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int count = 0;
        for(int i=1; i<=N; i++) {
            String str = String.valueOf(i);

            for(int j=0; j<str.length(); j++) {
                char c = str.charAt(j);
                if(c=='3' || c=='6' || c=='9') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
