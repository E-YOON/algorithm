import java.util.Scanner;

public class b10797 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        scan.close();

        int arr[] = {a, b, c, d, e};
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%10 == x) {
                count++;
            }
        }

        System.out.println(count);
    }
}
