import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;

        while(left <= right) {
            if(left == right) {
                answer++;
                break;
            }
            if(people[left] + people[right] <= limit) {
                answer++;
                right--;
                left++;
            } else {
                answer++;
                right--;
            }
        }
        return answer;
    }
}
