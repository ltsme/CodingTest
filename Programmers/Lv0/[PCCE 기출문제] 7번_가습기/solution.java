// 상우가 사용하는 가습기에는 "auto", "target", "minimum"의 세 가지 모드가 있습니다.
// 가습기의 가습량은 0~5단계로 구분되며 각 모드 별 동작 방식은 다음과 같습니다.

// "auto" 모드

// 습도가 0 이상 10 미만인 경우 : 5단계
// 습도가 10 이상 20 미만인 경우 : 4단계
// 습도가 20 이상 30 미만인 경우 : 3단계
// 습도가 30 이상 40 미만인 경우 : 2단계
// 습도가 40 이상 50 미만인 경우 : 1단계
// 습도가 50 이상인 경우 : 0단계

// "target" 모드

// 습도가 설정값 미만일 경우 : 3단계
// 습도가 설정값 이상일 경우 : 1단계

// "minimum"모드

// 습도가 설정값 미만일 경우 : 1단계
// 습도가 설정값 이상일 경우 : 0단계

// 상우가 설정한 가습기의 모드를 나타낸 문자열 mode_type, 현재 공기 중 습도를 나타낸 정수 humidity,
// 설정값을 나타낸 정수 val_set이 주어질 때 현재 가습기가 몇 단계로 작동 중인지 return하도록
// 빈칸을 채워 solution 함수를 완성해 주세요.

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다.

class Solution {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3;
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else        
            return 5;
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0;
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity);
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set);
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}

// 문제 조건에 맞춰 String 값의 비교 .equals()의 사용과
// return 값에 대해 알아보는 문제이다.