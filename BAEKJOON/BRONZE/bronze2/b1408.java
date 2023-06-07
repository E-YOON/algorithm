// 24

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

        int now = (h*3600) + (m*60) + s;

        st = new StringTokenizer(br.readLine(), ":");
		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());

        int start = (h*3600) + (m*60) + s;

        int answer = 0;

        if(start > now) {
            answer = start - now;

        } else {
            answer = (24*3600) - (now-start);
        }

        System.out.printf("%02d:%02d:%02d", (answer / 3600), ((answer / 60) % 60), (answer % 60));
    }
}
