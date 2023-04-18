import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class b1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int s = Integer.parseInt(br.readLine());
        int[][] arr = new int[s][5];
        int num = 0;
        int grade = 0;

        for(int i=0; i<s; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<s; i++) {
            Set<Integer> set = new HashSet<>();

            for(int j=0; j<5; j++) {
                for(int k=0; k<s; k++) {
                    if(i == k) continue;

                    if(arr[i][j] == arr[k][j]) {
                        set.add(k);
                    }
                }
            }

            if(grade < set.size()) {
                grade = set.size();
                num = i+1;
            }
        }

        System.out.println(num == 0 ? 1 : num);
    }
}
