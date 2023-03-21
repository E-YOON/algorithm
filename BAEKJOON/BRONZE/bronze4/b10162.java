import java.util.Scanner;

public class b10162 {
    static int a;
    static int b;
    static int c;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();

        a = 0;
        b = 0;
        c = 0;

        if(i%10 != 0) {
            System.out.println("-1");
            return;
        }

        r(i);
        System.out.println(a + " " + b + " " + c);
    }

    static void r(int i) {
        if(i == 0) return;

        if(i >= 300) {
            i -= 300;
            a++;
            r(i);
        } else if(i >= 60) {
            i -= 60;
            b++;
            r(i);
        } else if(i >= 10) {
            i -= 10;
            c++;
            r(i);
        }
    }
}
