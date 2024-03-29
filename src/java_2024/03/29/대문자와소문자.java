class Solution {

    public String solution(String my_string) {
        String[] arr = my_string.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[i].toUpperCase())) {
                arr[i] = arr[i].toLowerCase();
            } else {
                arr[i] = arr[i].toUpperCase();
            }
        }
        return String.join("", arr);
    }
}