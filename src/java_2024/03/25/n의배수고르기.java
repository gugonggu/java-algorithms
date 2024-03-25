import java.util.ArrayList;

class Solution {

    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                ans.add(numlist[i]);
            }
        }
        int[] ans2 = new int[ans.size()];
        for (int i = 0; i < ans2.length; i++) {
            ans2[i] = ans.get(i);
        }
        return ans2;
    }
}