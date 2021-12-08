package lesson3;

public class FindNumber {
    public static void missingNumber (int[] arr) {
        int number = 0;
        if (arr.length == 0) {
            System.out.println("Missing number: 1");

        } else {
            number = arithmeticSequence(arr) - sumArray(arr);
            System.out.println("Missing number: " + number);
        }
    }


    private static int arithmeticSequence (int[] arr) {
        int sum = 0;
        sum = arr[arr.length-1] * (arr[arr.length-1]+1)/2;
        return sum;
    }
    private static int sumArray (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum +=arr[i];
        }
        return sum;
    }
}
