// 문서 검색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String find = br.readLine();
        int cnt = 0;

        while(str.contains(find)) {
            str = str.replaceFirst(find, "1");
            cnt++;
        }

        System.out.println(cnt);
    }
}
