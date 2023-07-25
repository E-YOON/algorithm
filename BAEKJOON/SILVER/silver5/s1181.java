// 단어 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class s1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] list = new String[N];
        for(int i=0; i<N; i++) {
            list[i] = br.readLine();
        }

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);

                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(list[0]);
        for(int i=1; i<N; i++) {
            if(!list[i].equals(list[i-1])) {
                System.out.println(list[i]);
            }
        }
    }
}
