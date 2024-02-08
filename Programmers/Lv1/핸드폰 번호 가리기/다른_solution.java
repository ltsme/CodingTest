문자열 배열
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}

// 정규식
// class Solution {
//   public String solution(String phone_number) {
//     return phone_number.replaceAll(".(?=.{4})", "*");
//   }
// }

// 풀이
// 받은 문자열을 .toCharArray()를 통해 Char 배열로 만들어 준다.
// 배열의 길이 (.length)에서 -4 한 만큼 배열의 값을 *로 만들어 준다.
// 마지막으로 char 배열 (char[]) 형태의 값을 다시 문자열로 만들기 위해
// String.valueof() 형태를 사용한다.