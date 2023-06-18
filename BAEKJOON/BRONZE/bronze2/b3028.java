// 창영마을

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class b3028 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 0));

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'A') {
                Collections.swap(list, 0, 1);

            } else if(str.charAt(i) == 'B') {
                Collections.swap(list, 1, 2);

            } else {
                Collections.swap(list, 0, 2);
            }
        }

        System.out.println(list.indexOf(1)+1);
    }
}
