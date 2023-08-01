// 덱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s10866 {

    static int first = 10000;
	static int last = 10000;
	static int size = 0;
	static int[] deque = new int[20001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                
                case "pop_front":
                    sb.append(pop_front()).append('\n');
                    break;

                case "pop_back":
                    sb.append(pop_back()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "front":
                    sb.append(front()).append('\n');
                    break;

                case "back":
                sb.append(back()).append('\n');
                break;
            }
        }

        System.out.println(sb);
    }

    public static void push_front(int num) {
        deque[first] = num;
        first--;
    }

    public static void push_back(int num) {
        last++;
        deque[last] = num;
        
    }

    public static int pop_front() {
        if(last - first == 0) {
            return -1;

        } else {
            int temp = deque[first+1];
            first++;
            return temp;
        }
    }

    public static int pop_back() {
        if(last - first == 0) {
            return -1;

        } else {
            int temp = deque[last];
            last--;
            return temp;
        }
    }

    public static int size() {
        return last - first;
    }

    public static int empty() {
        if(last - first == 0) {
            return 1;

        } else {
            return 0;
        }
    }

    public static int front() {
        if(last - first == 0) {
            return -1;

        } else {
            return deque[first+1];
        }
    }

    public static int back() {
        if(last - first == 0) {
            return -1;

        } else {
            return deque[last];
        }
    }
}
