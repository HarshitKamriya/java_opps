public class object {
    public static void main(String[] args) {
        int[] arr = {10,20};
        fun(arr);
        System.out.println(arr[0]+" "+arr[1]);

    }

    public static void fun(int[] arr){
        arr[0] = 40;
        arr[1] = 50;
    }
}
