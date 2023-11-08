class Solution {
    public boolean isStrictlyPalindromic(int n) {
        if (n <= 2) {
            return true;
        }

        String baseTenRepresentation = Integer.toString(n);

        for (int base = 2; base <= n - 2; base++) {
            String representationInBase = convertToBase(n, base);
            if (!isPalindrome(representationInBase)) {
                return false;
            }
        }

        return true;
    }

    private String convertToBase(int n, int base) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.insert(0, n % base);
            n /= base;
        }
        return result.toString();
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
