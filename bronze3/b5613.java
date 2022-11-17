import java.util.Scanner;

public class b5613 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        while(true) {
            String str = scan.next();
            if(str.equals("=")) break;
            int x = scan.nextInt();

            if(str.equals("+")) {
                value = value + x;
            } else if(str.equals("-")) {
                value = value - x;
            } else if(str.equals("*")) {
                value = value * x;
            } else if(str.equals("/")) {
                value = value / x;
            }
        }
        System.out.println(value);
        scan.close();
    }
}
