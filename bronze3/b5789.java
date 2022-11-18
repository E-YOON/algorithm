import java.util.Scanner;

public class b5789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0; i<N; i++) {
            String str = scan.nextLine();
            if(str.charAt(str.length()/2) == str.charAt(str.length()/2-1)) {
                System.out.println("Do-it");
            } else {
                System.out.println("Do-it-Not");
            }
        }
        scan.close();
    }
}
