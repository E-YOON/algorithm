import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 적어도 대부분의 배수
 */
public class b1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 1;

        while(true) {
            int cnt = 0;

            for(int j=0; j<5; j++) {
                if(answer % arr[j] == 0) {
                    cnt++;
                }
            }

            if(cnt >= 3) {
                System.out.println(answer);
                break;
            }
            
            answer++;
        }
    }
}