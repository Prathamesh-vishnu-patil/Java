
public class SubArr{

    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                System.out.print("{");
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]);
                    sum += numbers[k];
                    if (k < end) {
                        System.out.print(",");
                    }
                }
                if (sum < min) {
                    min = sum;
                }
                if (sum > max) {
                    max = sum;
                }
                System.out.print("} -> Sum : ");
                ts++;
                System.out.print(sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The minimum sub array sum is : " + min);
        System.out.println("The maximum sub array sum is " + max);
        System.out.println("Total subarrays : " + ts);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        printSubarrays(numbers);
    }
}
