package bronze5;

import java.util.Scanner;

public class b5597 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[31];
        for(int i=1; i<29; i++) {
            numbers[scan.nextInt()] = 1;
        }
        scan.close();

        for(int i=1; i<numbers.length; i++) {
            if(numbers[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
