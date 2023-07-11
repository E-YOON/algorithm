// 그룹 단어 체커

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(check(str) == true) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static boolean check(String str) {
        boolean[] check = new boolean[26];
        int pre = 0;

        for(int j=0; j<str.length(); j++) {
            char now = str.charAt(j);

            if(pre != now) {
                if(check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    pre = now;

                } else {
                    return false;
                }

            } else {
                continue;
            }
        }

        return true;
    }
}
