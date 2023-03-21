public class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i=0; i<dic.length; i++) {
            String str = "";
            for(int j=0; j<spell.length; j++) {
                str += "1";
                if(dic[i].contains(spell[j]) != true) {
                    dic[i] = "not";
                    break;
                } else {
                    dic[i] = dic[i].replace(spell[j], "1");
                }
            }
            System.out.println(dic[i]);
            if(dic[i].equals(str)) {
                answer = 1;
            }
        }
        return answer;
    }
}
