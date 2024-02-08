// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

// N의 범위 : 100,000,000 이하의 자연수

// import java.util.*;

// public class Solution {
//     public int solution(int n) {
//         int answer = 0;

//         [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//         System.out.println("Hello Java");

//         return answer;
//     }
// }

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}

// 풀이
// n을 10으로 나눈 나머지가 곧 1의자리 값 이므로,
// n % 10을 하며 나온 결과를 계속 더해준다. 또한 연산마다 n / 10을 해준다.
// 이 모든 과정은 while (n>0)인 동안에만 이루어진다. (마지막 연산이 끝나면 0이하 소숫점이 되므로, int의 성질에 의해 0이 된다.)