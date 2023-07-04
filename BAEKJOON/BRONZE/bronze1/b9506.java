// 약수들의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class b9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == -1) break;

            ArrayList<Integer> aliquot = new ArrayList<>();
            int sum = 0;
            for(int i=1; i<n; i++) {
                if(n % i == 0) {
                    aliquot.add(i);
                    sum += i;
                }
            }

            if(n == sum) {
                System.out.print(n + " = 1");
                for(int i=1; i<aliquot.size(); i++) {
                    System.out.print(" + " + aliquot.get(i));
                }
                System.out.println();
                
            } else {
                System.out.println(n + " is NOT perfect.");
            }

        }
    }
}
