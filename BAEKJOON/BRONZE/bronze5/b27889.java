import java.util.Scanner;

public class b27889 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        switch (str) {
            case "NLCS": System.out.println("North London Collegiate School");
                break;
            
            case "BHA": System.out.println("Branksome Hall Asia");
                break;

            case "KIS": System.out.println("Korea International School");
                break;

            case "SJA": System.out.println("St. Johnsbury Academy");
                break;
        }
    }
}
