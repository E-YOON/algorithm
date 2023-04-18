import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yeondu = br.readLine();
        int ydLength = yeondu.length();
        int L = ydLength - yeondu.replaceAll("L", "").length();
		int O = ydLength - yeondu.replaceAll("O", "").length();
		int V = ydLength - yeondu.replaceAll("V", "").length();
		int E = ydLength - yeondu.replaceAll("E", "").length();

        int N = Integer.parseInt(br.readLine());
        int max = 0;
        String answer = "ZZZZZZZZZZZZZZZZZZZ";

        for(int i=0; i<N; i++) {
            String team = br.readLine();
            int teamLength = team.length();
            int tL = teamLength - team.replaceAll("L", "").length();
			int tO = teamLength - team.replaceAll("O", "").length();
			int tV = teamLength - team.replaceAll("V", "").length();
			int tE = teamLength - team.replaceAll("E", "").length();
            int score = cal(L+tL, O+tO, V+tV, E+tE);

            if(max < score) {
                max = score;
                answer = team;
            } else if(max == score) {
                if(answer.compareTo(team) > 0) {
                    answer = team;
                }
            }
        }
        System.out.println(answer);
    }

    public static int cal(int L, int O, int V, int E) {
        return ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
    }
}
