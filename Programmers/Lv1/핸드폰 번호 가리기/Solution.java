// 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
// 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를
// 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

// phone_number는 길이 4 이상, 20이하인 문자열입니다.

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String tmp = "";
        
        tmp = phone_number.substring(phone_number.length()-4, phone_number.length());
        for(int i=0; i<phone_number.length()-4; i++){
            answer += "*";
        }

        answer += tmp;
        return answer;
    }
}

// 풀이
// 문자열에 대해 .substring(A,B)에 의해 A에서 B까지의 값만 보존된다. (잘라져 보관)
// 따라서 .length()-4 , .length()에 의해 끝에서 4번째 까지 문자열이 보존된다.
// 이후 0에서 부터 .length()-4 까지의 값은 *처리하면 끝!