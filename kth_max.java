public class kth_max {
    public static int[] sort(int[] sarr) {
        for (int i = 0; i < sarr.length; i++) {
            for (int j = 0; j < sarr.length-i-1; j++) {
                if (sarr[j] < sarr[j+1]) {
                    int temp = sarr[j];
                    sarr[j] = sarr[j+1];
                    sarr[j+1] = temp;
                }
            }
        }
        return sarr;
    }
    public static void main(String[] args) {
        int[] arr = {21,38,20,18,14,27};

        int[] sor = sort(arr);

        int k = 2;

        System.out.print(sor[k-1] + " ");
    }
}
