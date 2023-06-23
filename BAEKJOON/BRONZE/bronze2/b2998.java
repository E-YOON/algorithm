// 8진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if(str.length() % 3 == 1) {
            str = "00" + str;
        } else if(str.length() % 3 == 2) {
            str = "0" + str;
        }

        StringBuffer result = new StringBuffer();
        for(int i=0; i<str.length(); i+=3) {
            String s = str.substring(i, i+3);
            switch (s) {
                case "000": result.append("0");;
                    break;
            
                case "001": result.append("1");;
                    break;

                case "010": result.append("2");;
                    break;

                case "011": result.append("3");;
                    break;

                case "100": result.append("4");;
                    break;

                case "101": result.append("5");;
                    break;

                case "110": result.append("6");;
                    break;

                case "111": result.append("7");;
                    break;
            }
        }
        
        System.out.println(result);
    }
}
