import java.util.Scanner;

public class b25703 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        System.out.println("int a;");
        System.out.println("int *ptr = &a;");

        String p = "*";

        for(int i=2; i<=N; i++) {
            String x = i == 2 ? "" : String.valueOf(i-1); 
            System.out.println("int " + p.repeat(i) + "ptr" + i + " = &ptr" + x + ";");
        }
    }
}
