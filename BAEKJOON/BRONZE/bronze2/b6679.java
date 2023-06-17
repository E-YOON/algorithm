// 싱기한 네자리 숫자

public class b6679 {
    public static void main(String[] args) {
        for(int i=1000; i<10000; i++) {

            // 10진수
            int sum10 = 0;
            for(int j=i; j>0; j/=10) {
                sum10 += j%10;
            }

            // 12진수
            int sum12 = 0;
            for(int j=i; j>0; j/=12) {
                sum12 += j%12;
            }

            // 16진수
            int sum16 = 0;
            for(int j=i; j>0; j/=16) {
                sum16 += j%16;
            }

            if(sum10 == sum12 && sum12 == sum16) {
                System.out.println(i);
            }
        }
    }
}
