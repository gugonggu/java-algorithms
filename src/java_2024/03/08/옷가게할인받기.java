class Solution {

    public int solution(int price) {
        double salePercent = 1.0;
        if (price >= 500000) {
            salePercent = 0.8;
        } else if (price >= 300000) {
            salePercent = 0.9;
        } else if (price >= 100000) {
            salePercent = 0.95;
        }
        return (int) (salePercent * price);
    }
}