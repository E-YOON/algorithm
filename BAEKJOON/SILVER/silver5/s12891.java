import java.io.*;
import java.util.*;

// DNA 비밀번호
public class s12891 {
    
    static int nowArr[];
    static int checkArr[];
    static int checkCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] charArr = new char[S];   // 임의로 만든 DNA 문자열
        checkArr = new int[4];          // ACGT 최소 개수
        nowArr = new int[4];            // 현재 배열의 ACGT 개수
        checkCount = 0;                 // 몇 개의 문자를 충족했는지 개수
        int answer = 0;

        charArr = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) {
                checkCount++;
            }
        }

        // 초기 배열 세팅
        for(int i=0; i<P; i++) {
            Add(charArr[i]);
        }

        if(checkCount == 4) {
            answer++;
        }

        // 슬라이딩 윈도우
        for(int i=P; i<S; i++) {
            int j = i - P;
            Add(charArr[i]);
            Remove(charArr[j]);

            if(checkCount == 4) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    // 새로 들어온 문자 처리
    private static void Add(char c) {
        switch (c) {
            case 'A':
                nowArr[0]++;
                if(nowArr[0] == checkArr[0])
                    checkCount++;                
                break;

            case 'C':
                nowArr[1]++;
                if(nowArr[1] == checkArr[1])
                    checkCount++;
                break;

            case 'G':
                nowArr[2]++;
                if(nowArr[2] == checkArr[2])
                    checkCount++;
                break;

            case 'P':
                nowArr[3]++;
                if(nowArr[3] == checkArr[3])
                    checkCount++;
                break;
        }
    }

    // 제거되는 문자 처리
    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(nowArr[0] == checkArr[0])
                    checkCount--; 
                nowArr[0]--;
                break;

            case 'C':
                if(nowArr[1] == checkArr[1])
                    checkCount--; 
                nowArr[1]--;
                break;

            case 'G':
                if(nowArr[2] == checkArr[2])
                    checkCount--; 
                nowArr[2]--;
                break;

            case 'P':
                if(nowArr[3] == checkArr[3])
                    checkCount--; 
                nowArr[3]--;
                break;
        }
    }

}
