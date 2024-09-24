class Solution {
    public int[] closestDivisors(int num) {
        int[] res1 = findClosestDivisors(num + 1);
        int[] res2 = findClosestDivisors(num + 2);

        if (Math.abs(res1[0] - res1[1]) < Math.abs(res2[0] - res2[1])) {
            return res1;
        } else {
            return res2;
        }
    }

    private int[] findClosestDivisors(int n) {
        int sqrtN = (int) Math.sqrt(n);
        for (int i = sqrtN; i > 0; i--) {
            if (n % i == 0) {  
                int pairDivisor = n / i;
                return new int[]{i, pairDivisor};  
            }
        }
        return new int[]{-1, -1};  
    
    }
}