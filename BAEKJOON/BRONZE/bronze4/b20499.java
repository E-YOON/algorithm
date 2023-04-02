import java.util.Scanner;

public class b20499 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        String[] strArr = str.split("/");

        if(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]) < Integer.parseInt(strArr[1])) {
            System.out.println("hasu");
        } else if(strArr[1].equals("0")) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}
