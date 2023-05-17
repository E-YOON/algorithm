// 개표

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        String[] vote = br.readLine().split("");
        int countA = 0, countB = 0;

        for(int i=0; i<vote.length; i++) {
            if(vote[i].equals("A")) {
                countA++;
            } else if(vote[i].equals("B")) {
                countB++;
            }
        }

        if(countA > countB) {
            System.out.println("A");
        } else if(countA < countB) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}
