import java.util.Scanner;

public class b5354 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=0; i<t; i++) {
            int x = scan.nextInt();

            for(int j=0; j<x; j++) {
                for(int h=0; h<x; h++) {
                    if(j==0 || j==x-1 || h==0 || h==x-1) {
                        System.out.print("#");
                    } else {
                        System.out.print("J");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}
