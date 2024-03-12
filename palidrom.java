public class palidrom{
    public static void main(String[] args) {
        
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        return reverse == x;
    }
}