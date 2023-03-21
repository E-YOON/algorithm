package bronze5;

import java.util.Scanner;

public class b2744 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] chArr = str.toCharArray();
        scan.close();
        String answer = "";
        for(int i=0; i<chArr.length; i++) {
            if(Character.isUpperCase(chArr[i])) {
                answer += Character.toLowerCase(chArr[i]);
            } else {
                answer += Character.toUpperCase(chArr[i]);
            }
        }
        System.out.println(answer);
    }
}
