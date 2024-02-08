// 나이를 세는 방법은 여러 가지가 있습니다. 그중 한국식 나이는 태어난 순간 1살이 되며
// 해가 바뀔 때마다 1살씩 더 먹게 됩니다. 연 나이는 태어난 순간 0살이며
// 해가 바뀔 때마다 1살씩 더 먹게 됩니다. 각각 나이의 계산법은 다음과 같습니다.

// 한국식 나이 : 현재 연도 - 출생 연도 + 1
// 연 나이 : 현재 연도 - 출생 연도

// 출생 연도를 나타내는 정수 year와 구하려는 나이의 종류를 나타내는 문자열
// age_type이 주어질 때 2030년에 몇 살인지 출력하도록 빈칸을 채워 코드를 완성해 주세요.
// age_type이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.

// 1950 ≤ year ≤ 2030
// age_type은 "Korea" 또는 "Year"만 주어집니다.

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다.

// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         String age_type = sc.next();
//         int answer = 0;

//         if (age_type.equals(???)) {
//             answer = ???;
//         }
//         else if (age_type.equals("Year")) {
//             ???;
//         }

//         System.out.println(answer);
//     }
// }

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        }
        else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }
        System.out.println(answer);
    }
}

// 풀이
// 조건문과 int 연산에 대한 문제이다.
// 한국식 나이는 현재 연도 - 출생 연도 + 1 이다.