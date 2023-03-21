import java.util.Scanner;

public class b6321 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n; i++) {
            String[] arr = scan.next().split("");
            System.out.println("String #" + (i+1));

            for(int j=0; j<arr.length; j++) {
                char answer = arr[j].charAt(0);
                answer += 1;
                if(answer == 91) answer=65;
                System.out.print(answer);
            }
            System.out.println();
            System.out.println();
        }

        scan.close();
    }
}
