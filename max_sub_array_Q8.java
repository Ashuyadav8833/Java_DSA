public class max_sub_array_Q8 {
    public static void main(String[] args) {
        int arr[] = {5,2,-8,7,5,1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int currsum = 0;
            for (int j = i; j < arr.length; j++) {
                currsum += arr[j];
            }
            if (currsum > sum)
                sum = currsum;
        }

        System.out.print(sum);
    }
}