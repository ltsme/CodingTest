// 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 단어를 조합한 발음밖에 하지 못합니다.
// 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return 하도록 solution 함수를 완성해주세요.

// ["aya", "yee", "u", "maa", "wyeoo"]	
// 1

// ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]
// 3

// 네 가지를 붙여 만들 수 있는 발음 이외에는 어떤 발음도 할 수 없는 것으로 규정합니다.
// 예를 들어 "woowo"는 "woo"는 발음할 수 있지만 "wo"를 발음할 수 없기 때문에 할 수 없는 발음입니다.

class Solution {
    public int solution(String[] babbling) {
        String[] word = {"aya", "ye", "woo", "ma"};
        int cnt = 0;
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<word.length; j++){
                babbling[i] = babbling[i].replace(word[j],"0");
            }
            babbling[i] = babbling[i].replaceAll("0", "");
            if (babbling[i].equals("")) cnt++; // babbling[i].isEmpty()
        }   
       
        int answer = cnt;
        return answer;
    }
}