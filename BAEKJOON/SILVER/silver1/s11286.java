// 절댓값 힙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class s11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int o1_abs = Math.abs(o1);
            int o2_abs = Math.abs(o2);

            // 절댓값이 같으면 음수 우선 정렬
            if(o1_abs == o2_abs) {
                return o1 > o2 ? 1 : -1;

            // 절댓값 기준으로 정렬
            } else {
                return o1_abs - o2_abs;
            }
        });

        for(int i=0; i<N; i++) {
            int req = Integer.parseInt(br.readLine());
            // 0이면 배열에서 절댓값이 가장 작은 값 출력
            if(req == 0) {
                if(queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }

            } else {
                queue.add(req);
            }
        }
    }
}
