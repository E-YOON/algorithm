// 민균이의 비밀번호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            String reverse = new StringBuffer(str).reverse().toString();

            if(list.contains(reverse) || str.equals(reverse)) {
                System.out.println(str.length() + " " + str.charAt(str.length()/2));
                return;
                
            } else {
                list.add(str);
            }

        }
    }
}
