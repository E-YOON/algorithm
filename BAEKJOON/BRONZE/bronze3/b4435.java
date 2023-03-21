import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4435 {
    final static int gdf[] = {1, 2, 3, 3, 4, 10};
    final static int sur[] = {1, 2, 2, 2, 3, 5, 10};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int gdfSum = 0;
            int surSum = 0;

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<gdf.length; j++) {
                int x = Integer.parseInt(st.nextToken());
                if(x != 0) gdfSum += (gdf[j]*x);
            }

            st = new StringTokenizer(br.readLine());
            for(int h=0; h<sur.length; h++) {
                int y = Integer.parseInt(st.nextToken());
                if(y != 0) surSum += (sur[h]*y);
            }

            if(gdfSum > surSum) 
                System.out.println("Battle " + (i+1) + ": Good triumphs over Evil" );
            else if(gdfSum < surSum) 
                System.out.println("Battle " + (i+1) + ": Evil eradicates all trace of Good");
            else 
                System.out.println("Battle " + (i+1) + ": No victor on this battle field");
        }
    }
}
