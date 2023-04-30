public class 글자지우기 {
    public String solution(String my_string, int[] indices) {
        char[] c = my_string.toCharArray();
        for(int i=0; i<indices.length; i++) {
            c[indices[i]] = ' ';
        }
        return new String(c).replaceAll("//s+", "");
    }
}
