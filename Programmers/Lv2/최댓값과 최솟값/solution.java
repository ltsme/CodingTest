// 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아
// 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
// 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

// s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.

class Solution {
    public String solution(String s) {
        

        String[] nums_str = s.split(" "); // split() : 특정 문자열 기준으로 잘라 String 배열에 넣어 줌
        int[] nums = new int[nums_str.length];

        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.parseInt(nums_str[i]);
        }

        for(int j=0; j<nums.length-1; j++){
            for(int i=0; i<nums.length-1-j; i++){
                if(nums[i] > nums[i+1]) {
                    int tmp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = tmp;
                }
            }
        }        
        
        answer += Integer.toString(nums[0]) + " " + Integer.toString(nums[nums.length-1]); // int -> String Integer.toString() 또는 String.valueOf() / 반대는 Integer.parseInt() 또는 Integer.valueOf()
        return answer;
    }
}