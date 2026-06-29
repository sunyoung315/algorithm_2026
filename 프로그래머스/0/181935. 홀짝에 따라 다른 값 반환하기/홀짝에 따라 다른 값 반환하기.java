class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i > 0; i --) {
            if(n % 2 == 0 && i % 2 == 0) {
                answer += Math.pow(i, 2);
            }
            
            if(n % 2 == 1 && i % 2 == 1) {
                answer += i;
            }
        }
        return answer;
    }
}