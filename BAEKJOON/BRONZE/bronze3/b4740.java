import java.util.Scanner;

public class b4740 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            String str = scan.nextLine();
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();

            if(str.equals("***")) break;

            System.out.println(reverse);
        }

        scan.close();
    }
}
