class Solution {

    public int solution(int slice, int n) {
        int answer = 0;
        while (n >= slice) {
            n -= slice;
            answer++;
        }
        if (n != 0) {
            answer++;
        }
        return answer;
    }
}