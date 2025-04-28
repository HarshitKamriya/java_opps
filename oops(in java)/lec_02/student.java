public class student {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        fun(x,y);
        System.out.println(x+" "+y);
        int[] arr = {10,20};
        fun(arr[0],arr[1]);
        System.out.println(arr[0]+" "+ arr[1]);
    }
    public static void fun(int x,int y){
        x =40;
        y = 50;
    }
}
