import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(st.nextToken(",")));
        }

        for(int i=0; i<K; i++) { 
            ArrayList<Integer> answer = solution(list);
            list = answer;
        }

        for(int i=0; i<list.size(); i++) {
            if(i==list.size()-1) {
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i)+",");
            }
        }
    }

    public static ArrayList<Integer> solution(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<list.size()-1; i++) {
            result.add(list.get(i+1)-list.get(i));
        }
        return result;
    }
}
