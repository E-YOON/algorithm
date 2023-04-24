import java.util.HashSet;

public class 방문길이 {
    public int solution(String dirs) {
        int answer = 0;
        String[] str = dirs.split("");
        HashSet<String> hashSet = new HashSet<>();
        int[] startXy = {0, 0};
        int[] endXy = {0, 0};

        for(int i=0; i<str.length; i++) {
            if(str[i].equals("R") && endXy[0]+1 <= 5) {
                endXy[0]++; 
            } else if(str[i].equals("L") && endXy[1]-1 >= -5) {
                endXy[0]--;
            } else if(str[i].equals("U") && endXy[0]+1 <= 5) {
                endXy[1]++;
            } else if(str[i].equals("D") && endXy[1]-1 >= -5) {
                endXy[1]--;
            } else {
                continue;
            }

            String root = startXy[0] +""+ startXy[1] +""+ endXy[0] +""+ endXy[1];
            if(!check(hashSet, root)) {
                answer++;
            }

            String goCoordinate = startXy[0] +""+ startXy[1] +""+ endXy[0] +""+ endXy[1];
            String backCoordinate = endXy[0] +""+ endXy[1] +""+ startXy[0] +""+ startXy[1];
            hashSet.add(goCoordinate);
            hashSet.add(backCoordinate);

            startXy[0] = endXy[0];
            startXy[1] = endXy[1];
        }

        return answer;
    }

    public boolean check(HashSet<String> hashSet, String str) {
        boolean isSame = false;
        for(String s : hashSet) {
            if(s.equals(str)) {
                isSame = true;
            }
        }
        return isSame;
    }
}
