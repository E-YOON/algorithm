import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1350 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        long cluster = Long.parseLong(br.readLine());

        for(int i=0; i<N; i++) {
            long file = Long.parseLong(st.nextToken());

            if(file != 0) {
                cnt += (file/cluster);

                if(file%cluster != 0) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt*cluster);
    }
}
