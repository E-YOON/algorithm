import java.util.Scanner;

public class b2857 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        int cnt = 0;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextLine();
        }
        scan.close();

        for(int i=0; i<arr.length; i++) {
            if(arr[i].contains("FBI")) {
                System.out.print(i+1+" ");
                cnt++;
            }
        }

        if(cnt == 0)
            System.out.println("HE GOT AWAY!");
    }
}