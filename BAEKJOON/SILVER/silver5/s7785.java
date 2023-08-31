// 회사에 있는 사람

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class s7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashSet<String> set = new HashSet<>();

        while(N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String doing = st.nextToken();

            switch (doing) {
                case "enter": set.add(name);                  
                    break;
            
                case "leave": set.remove(name);
                    break;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            list.add(it.next());
        }
        
        Collections.sort(list, Collections.reverseOrder());

        for(String s : list) {
            System.out.println(s);
        }
    }
}
