package bronze5;

import java.util.Scanner;

public class b5543 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] burgers = {scan.nextInt(), scan.nextInt(), scan.nextInt()};
        int[] drinks = {scan.nextInt(), scan.nextInt()};

        int min = 2000;

        for(int burger : burgers) {
            for(int drink : drinks) {
                if(min > burger + drink) {
                    min = burger + drink;
                }
            }
        }

        System.out.println(min-50);

        scan.close();
    }
}
