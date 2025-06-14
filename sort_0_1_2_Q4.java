public class sort_0_1_2_Q4 {
    public static void main(String[] args) {
        int arr[] = {0,2,1,1,0,2,0,0,1};
        int size = arr.length;
        int zero=0, one=0;

        for (int i = 0; i<size; i++) {
            if (arr[i] == 0)
                zero++;
            if (arr[i] == 1)
                one++;
        }
        one += zero;

        for (int i = 0; i<size; i++) {
            if (i < zero)
                arr[i] = 0;
            else if (i < one)
                arr[i] = 1;
            else
                arr[i] = 2;
        }

        for (int i = 0; i<size; i++) 
            System.out.print(arr[i]);
    }
}
