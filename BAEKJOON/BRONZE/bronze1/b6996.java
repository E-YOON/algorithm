import java.util.Arrays;
import java.util.Scanner;

public class b6996 {
    private static boolean solveAnagrams(String first, String second) {
        String[] A = first.split("");
        String[] B = second.split("");

        Arrays.sort(A);
        Arrays.sort(B);

        if(Arrays.equals(A, B)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }

        sc.close();
    }
}
