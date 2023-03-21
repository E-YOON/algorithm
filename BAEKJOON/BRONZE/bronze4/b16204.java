import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b16204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        /*
         * 예제
         * 앞 면에 O와 X가 적혀있는 카드 N(5)개
         * M(3)개의 카드 앞면에는 O가 한 개, 나머지 N-M(2)에는 X가 한 개    OOOXX
         * 카드의 뒷 면에 O를 K(3)개, X는 N-K(2)개 적으려고 한다            OOOXX
         * 앞 면과 뒷 면에 같은 모양이 적혀있는 카드의 최대 개수
         */

        int x = Math.min(M, K);
        int y = Math.min(N-M, N-K);

        System.out.println(x+y);
        
    }
}
