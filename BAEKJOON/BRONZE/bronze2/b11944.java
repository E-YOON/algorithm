// NN

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int numN = Integer.parseInt(n);
        int lenN = n.length();
        int m = Integer.parseInt(st.nextToken());
        String answer = "";

        for(int i=0; i<numN*lenN && i<=m; i+=lenN) {
            answer += n;
        }

        if(answer.length() > m) {
            System.out.print(answer.substring(0, m));
        } else {
            System.out.print(answer);
        }
    }
}
