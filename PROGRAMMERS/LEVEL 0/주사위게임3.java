import java.util.Arrays;

public class 주사위게임3 {
    public int solution(int a, int b, int c, int d) {
        int[] num = {a, b, c, d};
        Arrays.sort(num);

        if(num[0] == num[3]) {
            return num[0] * 1111;
        }

        if(num[0] == num[2] || num[1] == num[3]) {
            int p = num[0] == num[2] ? num[0] : num[3];
            int q = num[0] == num[2] ? num[3] : num[0];
            return (int) Math.pow(10 * p + q, 2);
        }

        if((num[0] == num[1] && num[2] == num[3]) ||
            (num[0] == num[2] && num[1] == num[3])) {
            return (num[0] + num[3]) * Math.abs(num[0] - num[3]);
        }

        if(num[0] == num[1] && num[2] != num[3] && num[2] != num[1]) {
            return num[2] * num[3];
        }

        if(num[1] == num[2] && num[0] != num[3] && num[0] != num[2]) {
            return num[0] * num[3];
        }

        if(num[2] == num[3] && num[0] != num[1] && num[0] != num[2]) {
            return num[0] * num[1];
        }

        if(num[0] < num[1] && num[1] < num[2] && num[2] < num[3]) {
            return num[0];
        }

        return 0;
    }
}
