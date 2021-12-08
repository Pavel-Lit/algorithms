package lesson3;

public class LostNumber {
    public int findLostNumber(int[] arr) {
//        if (arr.length == 0) {
//            return 1;
//        }

        int expectedSum = getExpectedSum(arr[arr.length - 1]);
        int actualSum = getSumOfArrayElements(arr);

        System.out.println("Expected Sum: " + expectedSum);
        System.out.println("Actual Sum: " + actualSum);

        return expectedSum - actualSum;
    }

    private int getExpectedSum(int n) {
        return n * (n + 1) / 2;
    }

    private int getSumOfArrayElements(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }

        return sum;
    }
}
