// 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
// 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

// n과 m은 각각 1000 이하인 자연수입니다.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String listStr= "";

        for(int i=0; i<a; i++){
            listStr += "*";  
        }

        for(int i=0; i<b; i++){
            System.out.println(listStr);   
        }
    }
}

// 풀이
// 가로 a, 세로 b에 대해
// for문 0 ~ a에 대해 문자열에 *을 더해준다.
// for문 0 ~ b에 대해 횟수 만큼 출력을 한다.

// for (int i = 0; i < b; i++) {
//     for (int j = 0; j < a; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// 이렇게 for문을 두 번 돌려도 된다.