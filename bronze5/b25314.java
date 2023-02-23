package bronze5;

import java.util.Scanner;

public class b25314 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=0; i<N/4; i++) {
            System.out.print("long ");
        }
        
        System.out.print("int");
    }
}
