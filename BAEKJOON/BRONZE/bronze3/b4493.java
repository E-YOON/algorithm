import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4493 {
    final static String ROCK = "R";
    final static String PAPER = "P";
    final static String SCISSORS = "S";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스
        for(int i=0; i<t; i++) {
            int R = Integer.parseInt(br.readLine());    // 가위바위보 횟수
            int p1Win=0, p2Win=0;
            
            for(int j=0; j<R; j++) {
                st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();

                if(p1.equals(ROCK)) {
                    if(p2.equals(SCISSORS)) {
                        p1Win++;
                    } else if(p2.equals(PAPER)) {
                        p2Win++;
                    }
                    
                } else if(p1.equals(PAPER)) {
                    if(p2.equals(ROCK)) {
                        p1Win++;
                    } else if(p2.equals(SCISSORS)) {
                        p2Win++;
                    }

                } else if(p1.equals(SCISSORS)) {
                    if(p2.equals(ROCK)) {
                        p2Win++;
                    } else if(p2.equals(PAPER)) {
                        p1Win++;
                    }
                }
            }

            if(p1Win > p2Win) {
                System.out.println("Player 1");
            } else if(p1Win < p2Win) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}
