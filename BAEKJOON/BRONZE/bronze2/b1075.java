import java.util.Scanner;

public class b1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int F = scan.nextInt();
        scan.close();

        int x=N/100;
        int y=x*100;

        while(true) {
            if(y%F==0) {
                System.out.printf("%02d",y%100);
                break;
            } else {
                y++;
            }
        }
    }
}
