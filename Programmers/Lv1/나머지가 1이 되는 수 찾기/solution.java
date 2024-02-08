// 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를
// return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.

// 3 ≤ n ≤ 1,000,000

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         return answer;
//     }
// }

class Solution {
    public int solution(int n) {
        int answer = 0;        
        for(int i = 1; i<n; i++){
            if(n % i == 1) {
                answer = i;
                return answer;
            }            
        }
        return answer;
    }
}

// 풀이
// 가장 작은 자연수 x를 구해야 하므로, 1부터 시작해 점차 올라가며
// 주어진 n을 기준으로 n % i == 1이 되는 i를 찾아 리턴해준다.