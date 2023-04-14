import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        char[] cArr = str.toCharArray();
        int[] arr = new int[26];

        for(int i=0; i<cArr.length; i++) {
            int index = cArr[i] - 65;
            arr[index]++;
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            } 
        }

        String answer = "";

        for(int i=0; i<arr.length; i++) {
            if(max == arr[i]) {
                answer += (char)(i + 65);
            }
        }

        if(answer.length() >= 2) {
            System.out.println("?");
        } else {
            System.out.println(answer);
        }

    }
}
