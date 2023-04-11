import java.util.ArrayList;
import java.util.Scanner;

public class b1076 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("black");
        list.add("brown");
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("violet");
        list.add("grey");
        list.add("white");

        Scanner scan = new Scanner(System.in);
        String fir = scan.nextLine();
        String sec = scan.nextLine();
        String thi = scan.nextLine();
        scan.close();

        long answer = 0L;
        answer += list.indexOf(fir)*10;
        answer += list.indexOf(sec);
        answer *= Math.pow(10, list.indexOf(thi));

        System.out.println(answer);
    }
}
