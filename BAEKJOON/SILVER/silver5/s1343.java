// 폴리오미노
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String aaaa = "AAAA";
        String bb = "BB";

        str = str.replaceAll("XXXX", aaaa);
        str = str.replaceAll("XX", bb);

        if(str.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(str);
        }
        
    }
}
