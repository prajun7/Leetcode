class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int prev = 0, cur = 1, next = 0;
        for (int i = 0; i < n - 1; i++) {
            next = prev + cur;
            prev = cur;
            cur = next;
        }
        return cur;
    }
}