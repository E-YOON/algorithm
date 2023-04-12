import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b1392 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=N; i++) {
            int time = Integer.parseInt(br.readLine());

            for(int j=0; j<time; j++) {
                list.add(i);
            }
        }

        for(int i=0; i<Q; i++) {
            int x = Integer.parseInt(br.readLine());
            System.out.println(list.get(x));
        }
    }
}
