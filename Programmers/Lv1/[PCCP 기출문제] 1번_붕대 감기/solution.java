// 붕대 감기는 t초 동안 붕대를 감으면서 1초마다 x만큼의 체력을 회복합니다. t초 연속으로 붕대를 감는 데 성공한다면 y만큼의 체력을 추가로 회복합니다.
// 현재 체력이 최대 체력보다 커지는 것은 불가능합니다.

// 기술을 쓰는 도중 몬스터에게 공격을 당하면 기술이 취소되고,
// 기술이 취소당하거나 기술이 끝나면 그 즉시 붕대 감기를 다시 사용하며, 연속 성공 시간이 0으로 초기화됩니다.

// 몬스터의 공격을 받으면 정해진 피해량만큼 현재 체력이 줄어듭니다. 이때, 현재 체력이 0 이하가 되면 캐릭터가 죽으며 더 이상 체력을 회복할 수 없습니다.

// 당신은 붕대감기 기술의 정보, 캐릭터가 가진 최대 체력과 몬스터의 공격 패턴이 주어질 때 캐릭터가 끝까지 생존할 수 있는지 궁금합니다.

// 붕대 감기 기술의 시전 시간, 1초당 회복량, 추가 회복량을 담은 1차원 정수 배열 bandage
// 최대 체력을 의미하는 정수 health, 몬스터의 공격 시간과 피해량을 담은 2차원 정수 배열 attacks가 매개변수로 주어집니다.
// 모든 공격이 끝난 직후 남은 체력을 return 하도록 solution 함수를 완성해 주세요.
// 만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return 해주세요.

// bandage는 [시전 시간, 초당 회복량, 추가 회복량] 형태의 길이가 3인 정수 배열입니다.
// 1 ≤ 시전 시간 = t ≤ 50
// 1 ≤ 초당 회복량 = x ≤ 100
// 1 ≤ 추가 회복량 = y ≤ 100

// 1 ≤ health ≤ 1,000
// 1 ≤ attacks의 길이 ≤ 100
// attacks[i]는 [공격 시간, 피해량] 형태의 길이가 2인 정수 배열입니다.

// attacks는 공격 시간을 기준으로 오름차순 정렬된 상태입니다.
// attacks의 공격 시간은 모두 다릅니다.
// 1 ≤ 공격 시간 ≤ 1,000
// 1 ≤ 피해량 ≤ 100

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health; // 최대 체력
        int t_b = bandage[0]; // 붕대 시전 시간
        int x_b = bandage[1]; // 붕대 초당 회복량
        int y_b = bandage[2]; // 붕대 추가 회복량 
        int[] t_atk = new int[attacks.length]; // 몬스터 공격 시간의 집합
        int[] d_atk = new int[attacks.length]; // 몬스터 피해량의 집합
        for(int i=0; i<attacks.length; i++){
            t_atk[i] = attacks[i][0];
            d_atk[i] = attacks[i][1];
        }
        int atk_counter = 0; // 몬스터 공격 카운터
        int b_counter = 0; // 붕대 연속 성공 카운터 
        
        // 초 단위의 연산, 몬스터의 공격이 끝나면 연산 종료
        for(int time=1; time<=t_atk[attacks.length-1]; time++)
        {            
            // 몬스터 공격 시
            if(time == t_atk[atk_counter]){
                answer -= d_atk[atk_counter]; // 피해 입음
                atk_counter ++; // 어택 카운터 +1
                b_counter = 0; // 붕대 카운터 초기화
            }else { // 공격이 아닐 시 회복
                b_counter += 1; // 붕대 카운터 +1
                if(b_counter == t_b){ 
                    answer += x_b + y_b; // 붕대 연속 성공 시 추가 회복
                    b_counter = 0; // 붕대 카운터 초기화
                }else{
                    answer += x_b; // 붕대 기본 회복
                }
                if(answer > health) {answer = health;} // 회복량 초과시, 체력 초기화
            }
            if(answer <= 0) { // 체력 0 이하시, for문 탈출(연산 끝)
                return -1;
            }
        }
        return answer;
    }
}