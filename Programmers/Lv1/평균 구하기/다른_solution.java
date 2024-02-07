// Arrays.stream() 사용 

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        answer = Arrays.stream(arr).average().getAsDouble();
        return answer;
    }
}

