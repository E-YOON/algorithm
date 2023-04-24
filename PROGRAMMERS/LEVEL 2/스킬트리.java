public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0; i<skill_trees.length; i++) {
            String str = skill_trees[i].replaceAll("[^" + skill + " ]", "");

            if(str.equals("")) {
                answer++;
                continue;
            }

            for(int j=0; j<=skill.length(); j++) {
                if(skill.substring(0, j).equals(str)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
