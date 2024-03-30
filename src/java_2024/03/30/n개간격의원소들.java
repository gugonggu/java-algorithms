import java.util.ArrayList;

class Solution {

    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
                arr.add(num_list[i]);
            }
        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }
}