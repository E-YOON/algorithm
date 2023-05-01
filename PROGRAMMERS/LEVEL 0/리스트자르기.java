import java.util.ArrayList;

public class 리스트자르기 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();

        if(n == 1) {
            for(int i=0; i<slicer[1]; i++) {
                answer.add(num_list[i]);
            }

        } else if(n == 2) {
            for(int i=slicer[0]; i<num_list.length; i++) {
                answer.add(num_list[i]);
            }

        } else if(n == 3) {
            for(int i=slicer[0]; i<slicer[1]; i++) {
                answer.add(num_list[i]);
            }

        } else if(n == 4) {
            int index = 0;
            for(int i=slicer[0]; i<slicer[1]; i++) {
                if(index % slicer[2] == 0) {
                    answer.add(num_list[i]);
                }
                index++;
            }

        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
