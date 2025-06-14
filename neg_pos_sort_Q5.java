public class neg_pos_sort_Q5 {
    public static void main(String[] args) {
        int[] arr = {1,56,3,-2,-39,-29,-35,11};

        int front=0, rear= arr.length - 1;

        while (front < rear) {
            if (arr[front] > 0 && arr[rear] < 0) {
                int temp = arr[front];
                arr[front] = arr[rear];
                arr[rear] = temp;
                front++;
                rear--;
            }
            else if (arr[front] > 0 && arr[rear] > 0) {
                rear--;
            }
            else if (arr[front] < 0 && arr[rear] < 0) {
                front++;
            }
            else {
                front++;
                rear--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
