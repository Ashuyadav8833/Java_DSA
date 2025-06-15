public class rev_string_Q21 {
    public static void main(String[] args) {
        String str = "ashu";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        str = arr.toString();
        System.out.print(str);
    }
}
