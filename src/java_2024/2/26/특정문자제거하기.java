class Solution {

    public String solution(String my_string, String letter) {
        String answer = "";
        String[] splitString = my_string.split("");
        for (int i = 0; i < splitString.length; i++) {
            if (!splitString[i].equals(letter)) {
                answer += splitString[i];
            }
        }
        return answer;
    }
}