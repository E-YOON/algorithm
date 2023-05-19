// Mini Fantasy War

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b12790 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int HP = Integer.parseInt(st.nextToken());
            int MP = Integer.parseInt(st.nextToken());
            int attack = Integer.parseInt(st.nextToken());
            int defense = Integer.parseInt(st.nextToken());
            int gearHP = Integer.parseInt(st.nextToken());
            int gearMP = Integer.parseInt(st.nextToken());
            int gearAttack = Integer.parseInt(st.nextToken());
            int gearDefense = Integer.parseInt(st.nextToken());

            HP = HP + gearHP < 1 ? 1 : HP + gearHP;
            MP = MP + gearMP < 1 ? 1 : MP + gearMP;
            attack = attack + gearAttack < 0 ? 0 : attack + gearAttack;
            defense += gearDefense;

            System.out.println(1 * HP + 5 * MP + 2 * attack + 2 * defense);
        }        
    }
}
