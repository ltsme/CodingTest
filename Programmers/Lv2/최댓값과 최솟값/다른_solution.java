// 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아
// 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
// 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

// s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.


//1 변수에 값 비교해서 넣기 
public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] tmp = str.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
                n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;
    }

//2 Array.sort 사용
    public class GetMinMaxString {
        public String getMinMaxString(String str) {
    
            String[] array = str.split(" ");
            int[] arrayInt = new int[array.length];
    
            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i] = Integer.parseInt(array[i]);
            }
    
            Arrays.sort(arrayInt);
            String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];
    
            return result;
    
        }