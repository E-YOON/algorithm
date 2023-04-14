import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 명령 프롬프트
 */
public class b1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if(N == 1) {
            System.out.println(br.readLine());
        } else {
            String str = br.readLine();
            String[] strArr = str.split("");

            for(int i=1; i<N; i++) {
                String compare = br.readLine();
                String[] compareArr = compare.split("");

                for(int j=0; j<strArr.length; j++) {
                    if(!strArr[j].equals(compareArr[j])) {
                        strArr[j] = "?";
                    }
                }
            }

            String answer = String.join("", strArr);
            System.out.println(answer);
        }
    }
    
}