class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int k = flowerbed.length;

        for (int i = 0; i < k && n > 0; i++) {

            if (flowerbed[i] == 0) {

                boolean left = (i == 0 || flowerbed[i - 1] == 0);
                boolean right = (i == k - 1 || flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n==0;

        
    }
}