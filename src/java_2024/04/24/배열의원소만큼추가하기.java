import java.util.ArrayList;

class Solution {

    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}