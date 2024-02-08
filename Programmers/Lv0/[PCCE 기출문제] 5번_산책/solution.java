// 여름이는 강아지를 산책시키려고 합니다. 여름이는 2차원 좌표평면에서
// 동/서/남/북 방향으로 1m 단위로 이동하면서 강아지를 산책시킵니다.
// 산책루트가 담긴 문자열 route가 주어질 때,
// 도착점의 위치를 return하도록 빈칸을 채워 solution함수를 완성해 주세요.

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다

// class Solution {
//     public int[] solution(String route) {
//         int east = 0;
//         int north = 0;
//         int[] answer = new int [2];
//         for(int i=0; i<route.length(); i++){
//             switch(route.charAt(i)){
//                 case 'N':
//                     north++;
//                     break;
//                 case 'S':
//                     ;
//                     break;
//                 case 'E':
//                     ;
//                     break;
//                 case 'W':
//                     ;
//                     ;
//             }
//         }
//         answer[0] = east;
//         answer[1] = north;
//         return answer;
//     }
// }

class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}

// 풀이
// switch, case 문제이다. (동, 서, 남, 북 4가지 경우에 대해 조건문)
