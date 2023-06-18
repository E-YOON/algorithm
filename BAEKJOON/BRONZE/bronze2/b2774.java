// 아름다운 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++) {
            ArrayList<String> list = new ArrayList<>();
            String X = br.readLine();
            for(int j=0; j<X.length(); j++) {
                if(!list.contains(String.valueOf(X.charAt(j)))) {
                    list.add(String.valueOf(X.charAt(j)));
                }
            }

            System.out.println(list.size());
        }
    }
}
