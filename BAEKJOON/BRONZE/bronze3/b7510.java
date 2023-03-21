import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = {Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken())};
            
            System.out.println("Scenario #" + (i+1) + ":");
            
            Arrays.sort(arr);

            if((arr[0]*arr[0]) + (arr[1]*arr[1]) == (arr[2]*arr[2])) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            System.out.println();
        }
    }
}
