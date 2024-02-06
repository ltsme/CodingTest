import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int curTime = 0;
        for(int i=0; i<attacks.length; i++){
            int time = attacks[i][0];
            int damage = attacks[i][1];
            int timeDiff = time - curTime - 1;
            int healingAmount = (bandage[1] * timeDiff) 
                + bandage[2] * (timeDiff/bandage[0]);

            if(health + healingAmount >= maxHealth){
                health = maxHealth;
            } else{
                health += healingAmount;
            }
            health -= damage;
            if(health<=0) return -1;
            curTime = time;
        }
        return health;
    }
}