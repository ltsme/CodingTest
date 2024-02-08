// 문자열 배열 형변환을 통한 자연수 자릿 수 구하기

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        for(String s : array){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}

// 풀이
// String.valueOf(정수).split(""); 에 의해 정수형이 문자열이 되며, 각각 단위별로 분해 된다.
// ex) 123 -> "1", "2", "3"

// 이는 각각 String[] array에 저장 된다.
// for(String s : array)에 의해 각각의 문자열 배열에 대해

// Integer.parseInt()에 의해 문자열이 정수형이 되어
// answer에 더해진다. 