import java.util.Scanner;

public class b10039 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int sum = 0;
        for(int i=0; i<5; i++) {
            int x = scan.nextInt();
            if(x < 40) {
                x = 40;
            }

            sum += x;
        }

        scan.close();

        System.out.println(sum/5);
    }
}
