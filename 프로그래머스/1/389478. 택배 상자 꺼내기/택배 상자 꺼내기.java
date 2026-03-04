class Solution {
    public int solution(int n, int w, int num) {
        // num 상자의 위치 찾기
        int targetIdx = num - 1; // 0-indexed
        int targetRow = targetIdx / w;
        int targetCol;
        
        // 짝수 행: 왼→오 (0,1,2,...,w-1)
        // 홀수 행: 오→왼 (w-1,w-2,...,0)
        if (targetRow % 2 == 0) {
            targetCol = targetIdx % w;
        } else {
            targetCol = w - 1 - (targetIdx % w);
        }
        
        // targetCol에서 targetRow 이상인 모든 상자 카운트
        int count = 0;
        int row = targetRow;
        
        while (true) {
            int boxIdx;
            if (row % 2 == 0) {
                boxIdx = row * w + targetCol;
            } else {
                boxIdx = row * w + (w - 1 - targetCol);
            }
            
            // 해당 위치의 상자 번호 (1-indexed)
            int boxNum = boxIdx + 1;
            
            if (boxNum > n) break; // 창고 범위 초과
            
            count++;
            row++;
        }
        
        return count;
    }
}