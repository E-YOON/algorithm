public class 수조작하기1 {
    public int solution(int n, String control) {
        String[] str = control.split("");

        for(String s : str) {
            if(s.equals("w")) {
                n++;
            } else if(s.equals("s")) {
                n--;
            } else if(s.equals("d")) {
                n += 10;
            } else if(s.equals("a")) {
                n -= 10;
            }
        }
        return n;
    }
}
