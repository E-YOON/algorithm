import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class b3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time1 = br.readLine();
        String time2 = br.readLine();

        SimpleDateFormat form = new SimpleDateFormat("HH:mm:ss");
        form.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        try {
            Date date1 = form.parse(time1);
            Date date2 = form.parse(time2);

            long diff = date2.getTime() - date1.getTime();

            if(diff == 0) {
                System.out.println("24:00:00");
            } else {
                System.out.println(form.format(diff));
            }

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

    }
}
