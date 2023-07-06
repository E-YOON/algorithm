// 나무 조각

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class b2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=1; i<6; i++) {
            list.add(Integer.parseInt(st.nextToken()));
            answer.add(i);
        }

        while(true) {
            if(list.get(0) > list.get(1)) {
                Collections.swap(list, 0, 1);
                for(int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            if(list.get(1) > list.get(2)) {
                Collections.swap(list, 1, 2);
                for(int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            if(list.get(2) > list.get(3)) {
                Collections.swap(list, 2, 3);
                for(int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            if(list.get(3) > list.get(4)) {
                Collections.swap(list, 3, 4);
                for(int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            if(Arrays.equals(list.toArray(), answer.toArray())) {
                break;
            }
        }
    }
}
