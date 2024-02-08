// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

// n은 0 이상 3000이하인 정수입니다.

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         return answer;
//     }
// }

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer += i;
            }
        }        
        return answer;
    }
}

// 풀이
// 정수 n을 입력받아, 1부터 시작해 정수 n까지의 자연수 중에
// n % i == 0 이 되는 i를 찾아 계속 더해주면
// 정답이 나온다.