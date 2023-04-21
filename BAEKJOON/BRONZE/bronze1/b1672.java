import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DNA 해독
public class b1672 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char last = str.charAt(str.length()-1);
        char b = ' ';

        for(int i=N-1; i>=0; i--) {
            b = str.charAt(i);
            last = change(b, last);
        }

        System.out.println(last);
    }

    public static char change(char b, char last) {
        char answer = ' ';
        if(b == 'A') {
            if(last == 'A') {
                answer = 'A';
            } else if(last == 'G') {
                answer = 'C';
            } else if(last == 'C') {
                answer = 'A';
            } else if(last == 'T') {
                answer = 'G';
            }
        } else if(b == 'G') {
            if(last == 'A') {
                answer = 'C';
            } else if(last == 'G') {
                answer = 'G';
            } else if(last == 'C') {
                answer = 'T';
            } else if(last == 'T') {
                answer = 'A';
            }
        } else if(b == 'C') {
            if(last == 'A') {
                answer = 'A';
            } else if(last == 'G') {
                answer = 'T';
            } else if(last == 'C') {
                answer = 'C';
            } else if(last == 'T') {
                answer = 'G';
            }
        } else if(b == 'T') {
            if(last == 'A') {
                answer = 'G';
            } else if(last == 'G') {
                answer = 'A';
            } else if(last == 'C') {
                answer = 'G';
            } else if(last == 'T') {
                answer = 'T';
            }
        }

        return answer;
    }
}
