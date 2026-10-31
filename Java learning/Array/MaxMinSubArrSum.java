public class MaxMinSubArrSum{

    public static void maxSubarrays(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                }
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
                System.out.println(sum);
            }
            System.out.println();
        }
        System.out.println("The maximum sum among the subarrays is : " + max);
        System.out.println("The minimum sum among the subarrays is : " + min);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        maxSubarrays(numbers);
    }
}
