// 알파벳 거리

import java.util.ArrayList;
import java.util.Scanner;

public class b5218 {
    private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) <= s2.charAt(i)) {
                answer.add(s2.charAt(i) - s1.charAt(i));
            } else {
                answer.add(s2.charAt(i) - s1.charAt(i) + 26);
            }
        }

        return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			String s1 = sc.next();
			String s2 = sc.next();

			ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
			System.out.print("Distances: ");

			for(Integer d : answer) {
				System.out.print(d+" ");
			}
			System.out.println();

		}

        sc.close();
	}
}
