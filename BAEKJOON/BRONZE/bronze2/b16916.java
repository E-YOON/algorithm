// 부분 문자열
// 참고 : https://loosie.tistory.com/193

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b16916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int answer = 0;
        
        int[] arr = new int[str2.length()];
        int index = 0;
        for(int i=1; i<arr.length; i++) {
            while(index>0 && str2.charAt(i) != str2.charAt(index)) {
                index = arr[index-1];
            }

            if(str2.charAt(i) == str2.charAt(index)) {
                index++;
                arr[i] = index;
            }
        }

        index = 0;
        for(int i=0; i<str1.length(); i++) {
            while(index>0 && str1.charAt(i) != str2.charAt(index)) {
                index = arr[index-1];
            }

            if(str1.charAt(i) == str2.charAt(index)) {
                if(index == str2.length()-1) {
                    index = arr[index];
                    answer = 1;
                } else {
                    index++;
                }
            }
        }

        System.out.println(answer);
    }
}
