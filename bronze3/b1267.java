import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1267 {
    public static final int Ytime = 30;
    public static final int Yfee = 10;    
    public static final int Mtime = 60;
    public static final int Mfee = 15;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int youngsik = 0;  //Y
        int minsik = 0;  //M

        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            youngsik += (a/Ytime+1)*Yfee;
            minsik += (a/Mtime+1)*Mfee;
        }

        if(minsik > youngsik) {
            System.out.println("Y " + youngsik);
        } else if(minsik < youngsik) {
            System.out.println("M " + minsik);
        } else {
            System.out.println("Y M " + youngsik);
        }

    }
}
