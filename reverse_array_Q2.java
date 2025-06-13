public class reverse_array_Q2 {
    public static void main(String[] args) {
        int arr[] = {21, 11, 28, 34, 6, 9, 69};
        int n = arr.length;

        // Reverse the array
        for (int i = 0; i < n / 2; i++) {
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
