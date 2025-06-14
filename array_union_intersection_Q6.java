public class array_union_intersection_Q6 {
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        int arr2[] = {2,8,16};

        System.out.print("Intersection : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }

        System.err.print("\nUnion : ");
        for (int i = 0; i < arr1.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) 
            System.out.print(arr2[i] + " ");
    }
}
