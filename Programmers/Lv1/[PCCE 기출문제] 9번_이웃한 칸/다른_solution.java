class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1};      
        String selctedColor = board[h][w];

        for(int i = 0; i<4; i++){
            
            // 이동할 좌표 h, w
            int h_mov = h + dh[i];
            int w_mov = w + dw[i];
            
            // 이동한 위치가 유효할 경우 (이동한 위치가 0 이상 & 최대 길이 이하)
            // h(행,레코드,튜플)의 경우 length, w(열,속성,필드)의 경우 특정 행의 length
            if((h_mov>=0) && (h_mov<board.length) && (w_mov>=0) && (w_mov<board[0].length))
            // 이를 반대로 해석해서 if(h_mov < 0 || h_mov >= board.length || w_mov < 0 || w_mov >= board[0].length) continue; 와 같이 표현 가능하다.
            {
                // for문을 돌며 이동한 칸의 색과 주어진 board의 색이 같을 때 결과 ++1
                if(selctedColor.equals(board[h_mov][w_mov])){
                    answer++;
                }
            }
        }                
        return answer;
    }   
 }