public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean result = true;
        String str = String.valueOf(x);
        int haftLength = str.length() / 2;
        for (int i = 0; i < haftLength; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }   

        return result;
    }
}
