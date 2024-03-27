class Solution {
    public String solution(String rsp) {
        String[] rspArr = rsp.split("");
        for(int i = 0; i < rspArr.length; i++){
            if(rspArr[i].equals("2")){
                rspArr[i] = "0";
            } else if (rspArr[i].equals("0")){
                rspArr[i] = "5";
            } else {
                rspArr[i] = "2";
            }
        }
        return String.join("", rspArr);
    }
}