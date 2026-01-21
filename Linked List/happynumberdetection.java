// Happy Number Detection using Floyd's Cycle-Finding Algorithm
// A happy number is defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not include 1. If it ends in 1, then the number is happy. We can use Floyd's Cycle-Finding Algorithm to detect cycles in this process. The time complexity is O(n) and the space complexity is O(1).

public class happynumberdetection {
    public boolean isHappyNumber(int number) {
        int slow = number;
        int fast = number;

        do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    public int findSquareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        happynumberdetection happyNumberDetector = new happynumberdetection();
        int number = 2;
        if (happyNumberDetector.isHappyNumber(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}
