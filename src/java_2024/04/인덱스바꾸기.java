class Solution {

    public String solution(String my_string, int num1, int num2) {
        String[] temp = my_string.split("");
        String tempStr = temp[num1];
        temp[num1] = temp[num2];
        temp[num2] = tempStr;
        return String.join("", temp);
    }
}