import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        String str = br.readLine();

        Arrays.sort(arr);

        if(str.indexOf('A') == 0) {
            if(str.indexOf('B') == 1) {
                System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
            } else {
                System.out.println(arr[0] + " " + arr[2] + " " + arr[1]);
            }
            
        } else if(str.indexOf('B') == 0) {
            if(str.indexOf('A') == 1) {
                System.out.println(arr[1] + " " + arr[0] + " " + arr[2]);
            } else {
                System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
            }
        } else {
            if(str.indexOf('B') == 1) {
                System.out.println(arr[2] + " " + arr[1] + " " + arr[0]);
            } else {
                System.out.println(arr[2] + " " + arr[0] + " " + arr[1]);
            }
        }
    }
}
