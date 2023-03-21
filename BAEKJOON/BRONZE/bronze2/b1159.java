package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[26];
        boolean can = false;
        for(int i=0; i<N; i++) {
            String name = br.readLine();
            char c = name.charAt(0);
            arr[c - 97]++;

            if(arr[c - 97] >= 5) can = true;
        }

        if(can) {
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= 5) System.out.print((char)(i+97));
            }
        } else {
            System.out.println("PREDAJA");
        }

    }
}
