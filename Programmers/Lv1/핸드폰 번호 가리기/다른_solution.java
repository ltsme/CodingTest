// 문자열 배열
// class Solution {
//   public String solution(String phone_number) {
//      char[] ch = phone_number.toCharArray();
//      for(int i = 0; i < ch.length - 4; i ++){
//          ch[i] = '*';
//      }
//      return String.valueOf(ch);
//   }
// }

// 정규식
// class Solution {
//   public String solution(String phone_number) {
//     return phone_number.replaceAll(".(?=.{4})", "*");
//   }
// }