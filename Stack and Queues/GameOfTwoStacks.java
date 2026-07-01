import java.util.*;

public class GameOfTwoStacks {

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return twoStacks(maxSum, a, b, 0, 0) - 1;
    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b, int sum, int count) {
        if (sum > maxSum) {
            return count;
        }

        if (a.size() == 0 || b.size() == 0) {
            return count;
        }

        int ans1 = twoStacks(
                maxSum,
                a.subList(1, a.size()),
                b,
                sum + a.get(0),
                count + 1);

        int ans2 = twoStacks(
                maxSum,
                a,
                b.subList(1, b.size()),
                sum + b.get(0),
                count + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maxSum: ");
        int maxSum = sc.nextInt();

        System.out.print("Enter size of first stack: ");
        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        System.out.println("Enter elements of first stack:");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.print("Enter size of second stack: ");
        int m = sc.nextInt();

        List<Integer> b = new ArrayList<>();
        System.out.println("Enter elements of second stack:");
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        int result = twoStacks(maxSum, a, b);
        System.out.println("Answer: " + result);

        sc.close();
    }
}