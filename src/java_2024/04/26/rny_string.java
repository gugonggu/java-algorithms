class Solution {

    public String solution(String rny_string) {
        String[] answer = rny_string.split("");
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].equals("m")) {
                answer[i] = "rn";
            }
        }
        return String.join("", answer);
    }
}