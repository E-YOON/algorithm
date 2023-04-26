import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        for(int i=0; i<a.length(); i++) {
            if(Character.isLowerCase(a.charAt(i))) {
                System.out.print(String.valueOf(a.charAt(i)).toUpperCase());
            } else {
                System.out.print(String.valueOf(a.charAt(i)).toLowerCase());
            }
        }
    }
}
