import java.util.Scanner;

public class b10808 {
    public static void main(String[] args ) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++) {
            arr[str.charAt(i)-97]++;
        }

        for(int i=0; i<26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
