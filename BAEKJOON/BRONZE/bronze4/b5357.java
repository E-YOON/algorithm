import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String answer = "";
            String str = br.readLine();
            String[] strArr = str.split("");
            String prev = "0";

            for(int j=0; j<strArr.length; j++) {
                if(!prev.equals(strArr[j])) {
                    answer += strArr[j];
                    prev = strArr[j];
                }
            }

            System.out.println(answer);
        }
    }
}
