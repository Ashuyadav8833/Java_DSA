class max_min_element_Q1 {
    public static void main(String[] args) {
        int arr[] = {21,11,28,34,6,9,69};
        int max,min;
        max = min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }

        System.out.println("Max element is : " + max);
        System.out.println("Min element is : " + min);
    }
}