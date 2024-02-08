// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

// arr은 길이 1 이상, 100 이하인 배열입니다.
// arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

// class Solution {
//     public double solution(int[] arr) {
//         double answer = 0;
//         return answer;
//     }
// }

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i=0; i<arr.length; i++){
           answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}

// 풀이
// 받은 정수 배열 arr에 대해 배열 길이만큼
// 0에서 부터 올라가며 arr의 값들을 answer에 넣어준다.
// answer를 arr배열의 길이만큼 나눠주면 평균 값이 나온다.
// arr.length는 4이다. 인덱스는 0~3 이다.