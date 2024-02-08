// 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해
// x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

// x는 -10000000 이상, 10000000 이하인 정수입니다.
// n은 1000 이하인 자연수입니다.

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++){
            answer[i] = x*(i+1);
        }
        return answer;
    }
}


// 풀이
// x부터 시작해, x만큼 커지는 배열을 만들어내야 하므로,
// i=0 일 때 x / i=1 일 때 x + x가 나올 수 있도록
// x + x(i) i는 0부터 시작