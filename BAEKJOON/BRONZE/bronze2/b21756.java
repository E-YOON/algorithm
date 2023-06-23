// 지우개

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b21756 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            list.add(i);
        }

        while(list.size() != 1) {
            for(int i=list.size()-1; i>=0; i--) {
                if(i % 2 == 0) {
                    list.remove(i);
                }
            }
        }

        System.out.println(list.get(0));
    }
}
