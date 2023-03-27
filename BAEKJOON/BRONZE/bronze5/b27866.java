import java.util.Scanner;

public class b27866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int i = scan.nextInt();
        scan.close();

        String[] strArr = str.split("");

        System.out.println(strArr[i+1]);
    }
}