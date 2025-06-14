public class cyclically_rotate_Q7 {
    public static void main(String[] args) {
        int arr[] = {1,55,38,5,2};

        arr = rotate(arr);

        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static int[] rotate(int[] arr) {
        int front = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = front;
        return arr;
    }
}
