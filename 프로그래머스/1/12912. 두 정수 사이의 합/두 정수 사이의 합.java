class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a<b){
            int tmp=a;
            a=b;
            b=tmp;
        }
        for(int n=b;n<=a;n++){
            answer+=n;
        }
        return answer;
    }
}