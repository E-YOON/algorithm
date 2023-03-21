package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b16099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            long lt = Long.parseLong(st.nextToken());  
            long wt = Long.parseLong(st.nextToken());  
            long le = Long.parseLong(st.nextToken());  
            long we = Long.parseLong(st.nextToken());  
            
            if(lt*wt > le*we) {
                System.out.println("TelecomParisTech");
            } else if(lt*wt < le*we) {
                System.out.println("Eurecom");
            } else {
                System.out.println("Tie");
            }
        }
        
    }
}
