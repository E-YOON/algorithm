import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int i = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            double x = Double.parseDouble(st.nextToken());  //지름 inch
            double y = Double.parseDouble(st.nextToken());  //회전수
            double z = Double.parseDouble(st.nextToken());  //시간 초
            
            if(y == 0) break;
            z = (z/60)/60;

            double distance = (x * 3.1415927) * y / 12 / 5280;
            double MPH = (distance / z);
            
            System.out.printf("Trip #%d: %.2f %.2f%n", i, distance, MPH);

            i++;
        }
    }
}
