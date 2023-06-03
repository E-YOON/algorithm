// 피시방 알바

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        int count = 0;

        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            if(list.contains(str)) {
                count++;
            } else {
                list.add(str);
            }
        }

        System.out.println(count);
    }
}
