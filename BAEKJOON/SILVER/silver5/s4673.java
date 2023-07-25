// 셀프 넘버

import java.util.ArrayList;

public class s4673 {
    public static void main(String[] args) {
        int num = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while(num <= 10000) {
            char[] c = String.valueOf(num).toCharArray();
            int temp = num;
            for(char x : c) {
                temp += Integer.parseInt(String.valueOf(x));
            }

            if(!list.contains(num)) {
                System.out.println(num);
                list.add(temp);

            } else {
                list.add(temp);
            }

            num++;
        }
    }
}