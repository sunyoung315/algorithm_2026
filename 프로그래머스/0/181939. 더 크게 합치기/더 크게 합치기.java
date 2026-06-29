class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a) + String.valueOf(b);
        String strB = String.valueOf(b) + String.valueOf(a);
        
        return Integer.parseInt(strA) >= Integer.parseInt(strB) ? Integer.parseInt(strA) : Integer.parseInt(strB);
    }
}